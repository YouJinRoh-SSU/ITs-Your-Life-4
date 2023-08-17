package web0817mvc.dao;

import java.sql.SQLException;
import java.util.List;

import web0817mvc.dto.MemberDto;
import web0817mvc.exception.DuplicatedIdException;
import web0817mvc.exception.RecordNotFoundException;


public interface MemberDao {
	//등록
	public void add(MemberDto dto) throws SQLException, DuplicatedIdException;
	//수정
	public void update(MemberDto dto) throws SQLException, RecordNotFoundException;
	//삭제
	public void delete(int no) throws SQLException, RecordNotFoundException;
	//갯수
	public int count() throws SQLException;
	//목록
	public List<MemberDto> list() throws SQLException;
	//id검색
	public MemberDto findById(int no) throws SQLException;
}
