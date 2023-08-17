package web0817mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web0817mvc.dto.MemberDto;
import web0817mvc.exception.DuplicatedIdException;
import web0817mvc.exception.RecordNotFoundException;
import web0817mvc.util.JdbcUtil;

public class MemberDaoImpl implements MemberDao {

	@Override
	public void add(MemberDto dto) throws SQLException, DuplicatedIdException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "INSERT INTO MEMBER(NO, NAME, EMAIL, PHONE, AGE)";
			sql += "VALUES( MEMBER_SEQ.NEXTVAL , ? , ? , ?, ? )";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setInt(4, dto.getAge());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
	}

	@Override
	public void update(MemberDto dto) throws SQLException, RecordNotFoundException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if( findById(dto.getNo()) == null )
				throw new RecordNotFoundException(dto.getNo()+"는 없습니다");

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "UPDATE MAMBER set NAME=?, EMAIL=?, PHONE=?, AGE=?";
			sql += "WHERE no = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setInt(4, dto.getAge());
			pstmt.setInt(5, dto.getNo());
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}	}

	@Override
	public void delete(int no) throws SQLException, RecordNotFoundException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if( findById(no) == null )
				throw new RecordNotFoundException(no+"는 없습니다");

			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "DELETE MEMBER ";
			sql += "WHERE no = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, no);
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}	
	}

	@Override
	public int count() throws SQLException {
		int count = 0;
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT count(*) FROM MEMBER ";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return count;
	}

	@Override
	public List<MemberDto> list() throws SQLException {
		List<MemberDto> result = new ArrayList<MemberDto>();
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM BOARD order by no DESC";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {//조회결과가 있다
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone"); 
				int age = rs.getInt("age");
				MemberDto dto = new MemberDto(no, name, email, phone, age);
				result.add(dto);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return result;

	}

	@Override
	public MemberDto findById(int no) throws SQLException {
		MemberDto dto = null;
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM MEMBER where no = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, no);
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {//조회결과가 있다
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone"); 
				int age = rs.getInt("age");
				dto = new MemberDto(no, name, email, phone, age);
			}
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return dto;
	}

}
