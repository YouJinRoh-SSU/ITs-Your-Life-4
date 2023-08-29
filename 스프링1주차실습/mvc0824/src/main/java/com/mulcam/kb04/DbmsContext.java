package com.mulcam.kb04;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DbmsContext {
	@Autowired
	DataSource ds;
	
	@GetMapping("/jndiTest")
	public String jndiTest() throws Exception {
		Connection conn = ds.getConnection();
		System.out.println("conn:"+conn);

		return "jndiTest";
	}
}
