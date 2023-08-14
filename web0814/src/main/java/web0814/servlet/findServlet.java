package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findServlet")
public class findServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int com_num = (int)(Math.random()*100+1);//1~100사이 난수 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "";
        String num = request.getParameter("num");
        try {
			int i = Integer.parseInt(num);
			if(i<0)
				throw new IllegalArgumentException("1보다 작습니다");
			if(i>100)
				throw new IllegalArgumentException("100보다 큽이다");
			if(i==com_num) {
			    result = "추카추카, 정답입니다";
			}else if(i<com_num) {
			    result = "높여주세요";
			}else {
			    result = "낮춰주세요";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "잘못된 입력입니다: "+e.getMessage();
		}
        response.setCharacterEncoding("EUC-KR");
        response.getWriter().append(result);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
