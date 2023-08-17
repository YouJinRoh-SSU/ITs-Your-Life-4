package web0816.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindNumberMvcServlet")
public class FindNumberMvcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
int com_num = new java.util.Random().nextInt(100)+1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("num");
		int i = Integer.parseInt(num);
		String result = "";
		if( com_num == i ) {
			result = "추카추카, 정답입니다";
		}else if( com_num < i ) {
			result = "숫자를 낮춰주세요";
		}else {
			result = "숫자를 높여주세요";
		}
		
		request.setAttribute("result", result);
		// memberRest2.jsp로 포워드
		request.getRequestDispatcher("/find_number_mvc.jsp").forward(request, response);

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
