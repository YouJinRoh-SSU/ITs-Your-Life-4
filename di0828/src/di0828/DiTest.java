package di0828;

import java.lang.annotation.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di0828.config.AppContext;
import di0828.config.AppContext2;
import di0828.service.HelloService;

public class DiTest {
	public static void main(String[] args) {
		//스프링은 서비스 클래스 등록 후 검색, 사용

//		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		 ApplicationContext context = new GenericXmlApplicationContext("classpath:beans.xml");
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppContext2.class);
		HelloService hs = context.getBean(HelloService.class);
//		HelloService hs = context.getBean("helloService");이름으로 하려면 부가적인 처리 필요. 타입으로 검색하는 것이 편함 
//		HelloService hs = context.getBean(HelloService.class);
		//id, name 속성값 또는 메서드명
//		HelloService hs = (HelloService) context.getBean("hs");
		String hello = hs.hello();
		System.out.println(hello);
	}

}
