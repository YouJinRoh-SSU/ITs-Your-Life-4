package web0816.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/bigshop/member","/bigshop_member"}) //맨 앞 /는 경로 의미 두번째 /는 프로젝트 이름
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String nm = request.getParameter("nm");
		System.out.println("nm = "+nm);
		String age = request.getParameter("age");
		System.out.println("age = "+age);
		
		response.setCharacterEncoding("EUC-KR");
		response.getWriter().append("nm = "+nm);
		response.getWriter().append(", age = "+age);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
