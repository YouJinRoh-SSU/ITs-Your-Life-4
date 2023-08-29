package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring01.dto.MemberDto;

public class MemberService {
	@Autowired(required = false)
	@Qualifier("memberDao")//주입할 빈이름 지정
	//같은타입의 빈이 여러개 등록된 경우 빈이름으로 지정 
	private MemberDao dao = null;
	
	public boolean login(String id, String passwd) {
		System.out.println("dao="+dao);
		return false;
	}
}
