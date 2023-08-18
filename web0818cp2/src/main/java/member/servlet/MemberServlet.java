package member.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //최초의 getparameter 전에 호출해야함
		String command ="list";//기본 작업 list로
		command = request.getParameter("command");//command라는 파라미터 추출
		if(command.trim().length()==0 || command == null) {
			command ="list";
		}
		String view = null;
		
		try {
			if(command.equals("insert_form")) {
				view += insert_form(request, response);// insert_form
		}} catch (Exception e) {
			e.printStackTrace();
			view += "/member_error.jsp";
			request.setAttribute("err_msg", e.getMessage());
		}
	}

	private String insert_form(HttpServletRequest request, HttpServletResponse response) {
		return "/member_insert_form.jsp";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
