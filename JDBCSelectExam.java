package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelectExam {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. JDBC Driver 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");//동적 로딩
		System.out.println("JDBC Driver 로딩 성공");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
		String user = "hr";
		String password = "HR";
		//2. DBMS 연결
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("DBMS 로그인 성공");
		//3.SQL 작성
		String sql = "SELECT * FROM MEMBERS where id = ?";//마지막 한칸 띄기
		//4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		//5. 데이터 설정
		pstmt.setString(1, "user03");
		//6. SQL 전송, 결과 수신
		//DML 전송 : executeUpdate() : int
		//select전송 : executeQuery() : ResultSet
		ResultSet rs = pstmt.executeQuery();
		String name = null;
		if(rs.next()){
			name = rs.getString("name");
		};
		System.out.println("name = "+name);
		//7. 자원 반환 
		pstmt.close();
		con.close();
		
	}
}

