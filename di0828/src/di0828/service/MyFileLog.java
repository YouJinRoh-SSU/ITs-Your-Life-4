package di0828.service;

import org.springframework.stereotype.Component;

@Component
public class MyFileLog extends MyLog{//MyLog를 대체하려면 상속받아야함
	public void log(String string) {
		System.out.println("파일: " + string);
	}

}
