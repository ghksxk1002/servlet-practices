package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("확인");
		// 값
		int iVal = 10;
		Long lVal = 10L;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "가나다라마바";

		UserVo userVo = new UserVo();
		userVo.setNo(10L);
		userVo.setName("둘리");

		// map
		Map<String, Object> map = new HashMap<>();
		map.put("iVal", iVal);
		map.put("lVal", lVal);
		map.put("fVal", fVal);
		map.put("bVal", bVal);

		request.setAttribute("map", map);

		request.setAttribute("user", userVo);

		request.setAttribute("iVal", iVal);
		request.setAttribute("lVal", lVal);
		request.setAttribute("fval", fVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("sVal", sVal);

		// 객체
		Object obj = null;
		request.setAttribute("obj", obj);

		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
