package jt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyTemplate {
	ApplicationContext context;
	JdbcTemplate jtemp;
	
	public MyTemplate() {
		this.context = new ClassPathXmlApplicationContext("spring-config.xml");
		this.jtemp = (JdbcTemplate)context.getBean("jtemp");
	}
	
	public JdbcTemplate getTemplate() {
		return jtemp;
		
	}
}
