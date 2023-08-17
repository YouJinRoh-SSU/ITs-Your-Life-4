package web0817mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web0817mvc.dao.MemberDao;
import web0817mvc.dao.MemberDaoImpl;
import web0817mvc.dto.MemberDto;


@WebServlet("/member/insert_action")
public class MemberUpdateActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//BoardDto 생성, 데이터 저장
		request.setCharacterEncoding("UTF-8"); //데이터 뽑기 전에 지정해줘야함
		MemberDto dto= new MemberDto();
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setPhone(request.getParameter("phone"));
		dto.setAge(Integer.parseInt(request.getParameter("age")));
		
		String url = "/board_ok.jsp";
		try {
			MemberDao dao = new MemberDaoImpl();
			dao.update(dto);
			request.setAttribute("msg", "게시물 수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
			url = "/member_insert_error.jsp";
			request.setAttribute("err_msg", e.getMessage()); //jsp에 메세지 전달
		} 
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
