package day_0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteExam {
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
		String sql = "DELETE FROM MEMBERS ";//마지막 한칸 띄기
		sql += "WHERE id = ?";//문자열은 ' ' 붙이기   //동적으로 만들려면 ?로 
		//4. Statement 생성
		PreparedStatement pstmt = con.prepareStatement(sql);
		//5. 데이터 설정
		pstmt.setString(1, "user05");//문자열이어도 ' ' 안붙임	
		//6. SQL 전송, 결과 수신
		//DML 전송 : executeUpdate() : int
		//select전송 : executeQuery() : ResultSet
		int count = pstmt.executeUpdate();
		System.out.println(count + "행 삭제완료");
		//7. 자원 반환 
		pstmt.close();
		con.close();
		
	}
}

