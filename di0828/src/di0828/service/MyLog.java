package di0828.service;

import org.springframework.stereotype.Component;

@Component
public class MyLog {
	public void log(String string) {
		System.out.println("ȭ��: " + string);
	}

}
