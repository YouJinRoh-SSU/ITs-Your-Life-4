package dao;

import java.sql.SQLException;
import java.util.List;

import HW0804.util.RecordNotFoundException;
import dto.UserDto;

public interface UserDao {
	// 고객 등록
	String insertUser(UserDto userDto) throws SQLException;
	
	// 고객 수정
	String updateUser(UserDto userDto) throws SQLException, RecordNotFoundException;
	
	// 고객 삭제
	String deleteUser(int userSeq) throws RecordNotFoundException, SQLException;
	
	// 고객 전체 조회
	List<UserDto> selectAll() throws SQLException;
	
	// 고객 1건 조회
//	UserDto selectOne(int userSeq);
	List<UserDto> selectOne(int userSeq) throws SQLException;
}
