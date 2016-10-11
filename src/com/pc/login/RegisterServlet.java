package com.pc.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pc.domain.User;
import com.pc.service.UserService;
import com.pc.utils.MyBeanUtils;

public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 设置编码
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
			int isInsert = new UserService().register(user);
			// 成功插入
			if (isInsert != 0) {
				response.getWriter().write("<h2 style='color:blue;'>恭喜您，插入成功</h2>");
			} else {
				response.getWriter().write("<h2 style='color:red;'>插入失败</h2>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
