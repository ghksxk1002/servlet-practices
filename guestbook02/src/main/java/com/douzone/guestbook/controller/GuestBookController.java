package com.douzone.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("a");
		System.out.println("귀찮아너무1");
		if ("deleteform".equals(action)) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);
			
		} else if ("add".equals(action)) {
			
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String text = request.getParameter("message");
			
			GuestBookVo vo = new GuestBookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setText(text);
			
			new GuestBookDao().insert(vo);

			response.sendRedirect("/guestbook02/gb");
		} else if("delete".equals(action)){
			
			request.setCharacterEncoding("UTF-8");

			String no =request.getParameter("no");
			Long no1 = Long.parseLong(no);
			String password = request.getParameter("password");
			
			GuestBookVo vo = new GuestBookVo();
			vo.setNo(no1);
			vo.setPassword(password);
			
			new GuestBookDao().delete(no1, password);

			response.sendRedirect("/guestbook02/gb");
			
		} else {
			
			GuestBookDao dao = new GuestBookDao();
			List<GuestBookVo> list = dao.findAll();

			request.setAttribute("list", list);

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
