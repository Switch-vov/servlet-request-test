package com.pc.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParamsServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		System.out.println("用户名:" + userName);
		System.out.println("密  码:" + password);
		System.out.println("性  别:" + sex);
		// 获取参数名为"hobby"的值
		String[] hobbys = request.getParameterValues("hobby");
		System.out.print("爱好:");
		for (int i = 0; i < hobbys.length; i++) {
			System.out.print(hobbys[i]);
			if(i != hobbys.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		String birthday = request.getParameter("birthday");
		System.out.println("密  码:" + birthday);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}