package mulcam.kb04.boot0831;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mulcam.kb04.boot0831.ifs.Greet;

@SpringBootApplication
public class Boot0831Application {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(Boot0831Application.class, args);
		Boot0831Application bean = context.getBean(Boot0831Application.class);
		bean.execute();
	}
	
	@Autowired
	private Greet greet;
	
	//사용자정의서비스
	public void execute() {
		System.out.println(greet.greeting());
	}
}
