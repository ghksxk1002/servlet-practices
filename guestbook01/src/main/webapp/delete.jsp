<%@page import="com.douzone.guestbook.dao.GuestBookDao"%>
<%@page import="com.douzone.guestbook.vo.GuestBookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String no =request.getParameter("no");
	Long no1 = Long.parseLong(no);
	String password = request.getParameter("password");
	
	GuestBookVo vo = new GuestBookVo();
	vo.setNo(no1);
	vo.setPassword(password);
	
	new GuestBookDao().delete(no1, password);

	response.sendRedirect("/guestbook01");
%>