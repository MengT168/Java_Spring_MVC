package com.meng.java;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitailizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebConfig.class);
		ctx.setServletContext(servletContext);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("springDispathcherServlet", new DispatcherServlet(ctx));
		
		servlet.setLoadOnStartup(1); //1 mean first servlet to be loaded
		servlet.addMapping("/");
	}

}
