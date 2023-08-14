package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")//클래스 메서드용 태그 => 클라이언트가 이름을 부를 때 등록하는 이름 
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletRequest : 요청 정보 저장 객체, HttpServletResponse : 응답 정보 
		response.getWriter().append("Served at: ").append("Hello Servlet Get");
		//getWriter:문자열 처리용
		String nm = request.getParameter("nm");
		System.out.println("nm=" + nm);//어디에 출력하는지 html에 쓴 get, doget에 작성 둘 다 get에 해야 실행 가능
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doget과 똑같음?
		doGet(request, response);
		//response.getWriter().append("Served at: ").append("Hello Servlet POST");
		response.getWriter().append("Hello Servlet POST");
	}
	

}
