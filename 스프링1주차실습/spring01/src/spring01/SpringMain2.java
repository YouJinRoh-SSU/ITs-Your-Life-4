package spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {

	public static void main(String[] args) {
		// xml 설정파일 읽기
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(AppContext.class);
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppContext.class);
		//설정파일에서 HeloService 검색
		MyCalc mc = context.getBean(MyCalc.class);
		//서비스 메서드 호출
		int result = mc.plus( 30,40 ); //3+4 결과를 반환
		System.out.println( result );
	}

}
