package day_0726;

public class LoginExam {
	public static void main(String[] args) throws 미등록IDException, 비밀번호틀림Exception {
		String id = "user100";
		String passwd = "1111";
		try {
			System.out.println("로그인 성공");
		} catch (미등록IDException e) {
			e.printStackTrace();
			System.out.println("메세지: "+ e.getMessage());
		}catch (비밀번호틀림Exception e) {
			e.printStackTrace();
		}
		login(id, passwd);
		System.out.println("로그인 성공");
	}//end main

	private static void login(String id, String passwd) throws 미등록IDException, 비밀번호틀림Exception {
			if(id != "user100") {
				throw new 미등록IDException(id + "는 없는 아이디입니다.");
		}			
		if(passwd != "1111") {
			throw new 비밀번호틀림Exception("비밀번호가 틀립니다.");
		}
		
	}//end login

}//end class
