package di0828.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import di0828.service.HelloService;

@Configuration
@ComponentScan(basePackages = "di0828.service") //�˻��� ��Ű�� �������� {"", "", ""}
public class AppContext2 {

}
