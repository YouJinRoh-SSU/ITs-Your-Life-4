package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import HW0804.util.JdbcUtil;
import HW0804.util.RecordNotFoundException;
import dto.UserDto;

// 아래 각 메소드를 구현하세요.
public class UserDaoImpl implements UserDao{

	@Override
	public String insertUser(UserDto userDto) throws SQLException {
		//DBMS연결
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = JdbcUtil.connect();
					// 3. SQL 작성
					String sql = "INSERT INTO users(UserSeq, Name, Email, Phone, isSleep)";
					sql += "VALUES( ?, ?, ?, ?, ? )";
					// 4. Statement 생성
					pstmt = con.prepareStatement(sql);
					// 5. 데이터 설정
					pstmt.setLong(1, userDto.getUserSeq());
					pstmt.setString(2, userDto.getName());
					pstmt.setString(3, userDto.getEmail());
					pstmt.setString(4, userDto.getPhone());
					pstmt.setBoolean(5, userDto.isSleep());		
					// 6. SQL 전송, 결과수신
					int count = pstmt.executeUpdate();
				} catch (ClassNotFoundException e) {
					throw new SQLException(e);
				} finally {
					JdbcUtil.close(pstmt, con);
				}
				return "추가 완료";
	}
	@Override
	public String updateUser(UserDto userDto) throws SQLException, RecordNotFoundException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		//등록여부검사
		if( selectOne(userDto.getUserSeq()) == null )
			throw new RecordNotFoundException(userDto.getUserSeq()+"는 없습니다");
		con = JdbcUtil.connect();
		// 3. SQL 작성
		String sql = "UPDATE users set Name=?, Email=?, Phone=?, isSleep=? ";
		sql += "WHERE UserSeq = ?";
		// 4. Statement 생성
		pstmt = con.prepareStatement(sql);
		// 5. 데이터 설정
		pstmt.setString(1, userDto.getName());
		pstmt.setString(2, userDto.getEmail());
		pstmt.setString(3, userDto.getPhone());
		pstmt.setBoolean(4, userDto.isSleep());
		pstmt.setLong(5, userDto.getUserSeq());
		// 6. SQL 전송, 결과수신
		int count = pstmt.executeUpdate();
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			} finally {
				JdbcUtil.close(pstmt, con);
			}
		return "업데이트 완료";
	}

	@Override
	public String deleteUser(int userSeq) throws RecordNotFoundException, SQLException {
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//등록여부검사
			if( selectOne(userSeq) == null )
				throw new RecordNotFoundException(userSeq+"는 없습니다");
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "DELETE users ";
			sql += "WHERE userSeq = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, userSeq);
			// 6. SQL 전송, 결과수신
			int count = pstmt.executeUpdate();
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
				} finally {
					JdbcUtil.close(pstmt, con);
				}
		return "삭제 완료";
	}

	@Override
	public List<UserDto> selectAll() throws SQLException {
		List<UserDto> result = new ArrayList<UserDto>();
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM users order by no DESC";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {//조회결과가 있다
				int UserSeq = rs.getInt("UserSeq");
				String Name = rs.getString("Name");
				String Email = rs.getString("Email");
				String Phone = rs.getString("Phone"); 
				Boolean isSleep = rs.getBoolean("isSleep");
				UserDto dto = new UserDto(UserSeq, Name, Email, Phone, isSleep);
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
	public List<UserDto> selectOne(int userSeq) throws SQLException {
		List<UserDto> result = new ArrayList<UserDto>();
		//DBMS연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.connect();
			// 3. SQL 작성
			String sql = "SELECT * FROM users order by no DESC";
			sql += "WHERE UserSeq = ?";
			// 4. Statement 생성
			pstmt = con.prepareStatement(sql);
			// 5. 데이터 설정
			pstmt.setInt(1, userSeq);
			// 6. SQL 전송, 결과수신
			//   DML전송: executeUpdate() : int 
			//   SELECT전송: executeQuery() : ResultSet
			ResultSet rs = pstmt.executeQuery();
				int UserSeq = rs.getInt("UserSeq");
				String Name = rs.getString("Name");
				String Email = rs.getString("Email");
				String Phone = rs.getString("Phone"); 
				Boolean isSleep = rs.getBoolean("isSleep");
				UserDto dto = new UserDto(UserSeq, Name, Email, Phone, isSleep);
				result.add(dto);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} finally {
			JdbcUtil.close(pstmt, con);
		}
		return result;
	}

}

