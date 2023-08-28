package di0828.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloService {//��ӵ� �ȹް�, ������ ���ϰ�, impl�� ���� POJO
	@Autowired
	@Qualifier("myLog")
	private MyLog myLog;//��� Ȯ��. Ȯ��� �ڽ� Ŭ���� �������̽��� ������� �� �ִ�?
	
	public String hello() {
		myLog.log("100");	
		return "�ȳ��ϼ���";
	}

}
