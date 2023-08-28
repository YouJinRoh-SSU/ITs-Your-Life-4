package di0828.config;

import org.springframework.context.annotation.Bean;

import di0828.service.HelloService;

public class AppContext {
	@Bean
	public HelloService hs() {	
		return new HelloService();//1°³¸¸ »ý¼ºÇÏ´Â ½Ì±ÛÅæ °´Ã¼
	}

}
