package di0828.service;

import org.springframework.stereotype.Component;

@Component
public class MyFileLog extends MyLog{//MyLog�� ��ü�Ϸ��� ��ӹ޾ƾ���
	public void log(String string) {
		System.out.println("����: " + string);
	}

}
