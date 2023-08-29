package com.mulcam.kb04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/hello")
	public String hello( Model model ) {
		model.addAttribute("msg", "안녕하세요~");
		return "hello"; // -> 안녕하세요 출력하도록 완성하세요~
	}

}
