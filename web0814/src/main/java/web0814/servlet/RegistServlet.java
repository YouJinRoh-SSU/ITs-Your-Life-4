package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println("이름 : " + name);
		String tel = request.getParameter("tel");
		System.out.println("연락처 : " + tel);
		String gender = request.getParameter("gender");
		System.out.println("성별 : " + gender);
		String major = request.getParameter("major ");
		System.out.println("전공 : " + major );
		response.setContentType("text/html");
		//response.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("EUC-KR");//한글 전용, 한글 안깨지게 해줌
		response.getWriter().append("이름 : "+ name);
		response.getWriter().append("\n연락처 : "+ tel);
		response.getWriter().append("\n성별 : " + gender);
		response.getWriter().append("\n전공 : " + major);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
