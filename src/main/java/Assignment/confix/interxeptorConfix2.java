package Assignment.confix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import Assignment.interceptor.demoLagInterceptor;


@Configuration
public class interxeptorConfix2 implements WebMvcConfigurer{
	@Autowired
	demoLagInterceptor loggerInter;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
   registry.addInterceptor(this.loggerInter).addPathPatterns("/**").excludePathPatterns("/login");
	}
	
}