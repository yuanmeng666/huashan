package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringbootWebApplication {

    private  static  Logger logger=LoggerFactory.getLogger(SpringbootWebApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
       return new MyViewResolver();
    }
    public  static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String s, Locale locale) {
            logger.warn("-----------------------------------logger");
            return null;
        }
    }
}
