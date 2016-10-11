package com.pc.beanutils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pc.domain.User;
import com.pc.utils.MyBeanUtils;

/**
 * 测试BeanUtils工具
 * 
 * @author Switch
 * @data 2016年10月11日
 * @version V1.0
 */
public class TestBeanServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			// 获取表单数据集
			Map<String, String[]> formMap = request.getParameterMap();
			// 封装数据
			User user = MyBeanUtils.populate(User.class, formMap);
			// 处理特殊数据类型
			String[] hobbies = request.getParameterValues("hobby");
			// 将其转换为hobby1,hobby2,hobby3这样的String
			String hobby = Arrays.toString(hobbies).substring(1, Arrays.toString(hobbies).length() - 1);
			user.setHobby(hobby);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
