package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Day001Springboot01Application extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
                return application.sources(Day001Springboot01Application.class);
        }
public static void main(String[] args) {
        SpringApplication.run(Day001Springboot01Application.class, args);
        }

        /**
         * 设置匹配.do后缀的请求
         * @param dispatcherServlet
         * @return
         */
      /* @Bean
        public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
                ServletRegistrationBean bean = new ServletRegistrationBean(dispatcherServlet);
                bean.addUrlMappings("*.do");
                bean.addUrlMappings("*.html");
                bean.addUrlMappings("*.js");
                return bean;
        }*/


        }
