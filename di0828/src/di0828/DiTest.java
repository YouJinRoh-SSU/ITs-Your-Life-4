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
		//�������� ���� Ŭ���� ��� �� �˻�, ���

//		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		 ApplicationContext context = new GenericXmlApplicationContext("classpath:beans.xml");
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppContext2.class);
		HelloService hs = context.getBean(HelloService.class);
//		HelloService hs = context.getBean("helloService");�̸����� �Ϸ��� �ΰ����� ó�� �ʿ�. Ÿ������ �˻��ϴ� ���� ���� 
//		HelloService hs = context.getBean(HelloService.class);
		//id, name �Ӽ��� �Ǵ� �޼����
//		HelloService hs = (HelloService) context.getBean("hs");
		String hello = hs.hello();
		System.out.println(hello);
	}

}
