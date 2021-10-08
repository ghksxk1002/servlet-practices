package com.douzone.emaillist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.douzone.emaillist.vo.EmaillistVo;
import com.douzone.emillist.dao.EmaillistDao;

public class EmaillistController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		// 분기제어
		String action = request.getParameter("a");
		if("list".equals(action)) {
			 EmaillistDao dao = new EmaillistDao();
			 List<EmaillistVo> list = dao.findAll();
			 
			 request.setAttribute("list", list);
			 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			 rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
