package web0817mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web0817mvc.dao.MemberDao;
import web0817mvc.dao.MemberDaoImpl;
import web0817mvc.dto.MemberDto;

@WebServlet("/member/update_form")
public class MemberUpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sno = request.getParameter("no");
		int no = Integer.parseInt(sno);
		String url = "/board_update_form.jsp";
		MemberDao dao = new MemberDaoImpl();
		try {
			MemberDto dto = dao.findById(no);
			request.setAttribute("dto", dto);
		} catch (SQLException e) {
			e.printStackTrace();
			url = "/member_error.jsp";
			request.setAttribute("err_msg", e.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);

	}
}
