package helloweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String COOKIE_NAME = "visitCount";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int visitCount = 0;
		
		// 쿠키읽기 : 자바에서는 쿠키를 객체로 만들어 놓았다
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			
			for(Cookie cookie : cookies) {
				// 쿠키 네임이 visitCount 이면 갑을 빼옴
				if(COOKIE_NAME.equals(cookie.getName())) {
					visitCount = Integer.parseInt(cookie.getValue());
				}
				
			}
			
		}
		
		visitCount++;
		
		Cookie cookie =  new Cookie(COOKIE_NAME, String.valueOf(visitCount));
		cookie.setPath(request.getContextPath());
		
		cookie.setMaxAge(24 * 60 * 60);
		response.addCookie(cookie);
		
		//화염출력
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>방문횟수" +visitCount+"</h1>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
