package com.adore96.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author kalharaperera ON 1/4/21
 * @project MVC-CRUD
 */

@Configuration
@ComponentScan({"com.adore96"})
public class MvcConfiguration {

    // To remove .jsp part from the controller class.
//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        return internalResourceViewResolver;
//    }
}
