package com.sh.we;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeShqkelServlet
 */
@WebServlet("/hello")
public class WeShqkelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter()
			.append("Served at: ")
			.append(request.getContextPath())
			.append("sqhkel이 /hello에 응답했습니다. ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
	}

}
