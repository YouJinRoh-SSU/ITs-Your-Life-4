package web0817mvc.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import web0817mvc.dao.BoardDao;
import web0817mvc.dao.BoardDaoImpl;
import web0817mvc.dto.BoardDto;


@WebServlet("/board/insert_action")
public class BoardUpdateActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//BoardDto 생성, 데이터 저장
		request.setCharacterEncoding("UTF-8"); //데이터 뽑기 전에 지정해줘야함
		BoardDto dto= new BoardDto();
		dto.setTitle(request.getParameter("title"));
		dto.setWriter(request.getParameter("writer"));
		dto.setContent(request.getParameter("content"));
		dto.setNo(Integer.parseInt(request.getParameter("no")));
		
		String url = "/board_ok.jsp";
		try {
			BoardDao dao = new BoardDaoImpl();
			dao.update(dto);
			request.setAttribute("msg", "게시물 수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
			url = "/board_insert_error.jsp";
			request.setAttribute("err_msg", e.getMessage()); //jsp에 메세지 전달
		} 
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
