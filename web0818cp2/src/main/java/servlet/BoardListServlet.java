package servlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import board.dao.BoardDao;
import board.dao.BoardDaoImpl;
import board.dto.BoardDto;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDaoImpl();
		String url = "/board_list.jsp";
		try {
			List<BoardDto> list = dao.list();
			request.setAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
			url = "/board_error.jsp";
			request.setAttribute("err_msg", e.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
