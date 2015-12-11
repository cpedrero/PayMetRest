package com.paymet.rest.main.conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringInizialicer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		 AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();	        
	     context.register(ConfigurationSpring.class);
	     context.close();
	}
}
