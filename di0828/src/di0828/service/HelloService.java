package di0828.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloService {//상속도 안받고, 의존도 안하고, impl도 안한 POJO
	@Autowired
	@Qualifier("myLog")
	private MyLog myLog;//기능 확장. 확장된 자식 클래스 인터페이스를 집어넣을 수 있다?
	
	public String hello() {
		myLog.log("100");	
		return "안녕하세요";
	}

}
