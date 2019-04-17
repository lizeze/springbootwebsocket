package com.suyu.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
   // 跨域处理，允许跨区请求
    @Configuration
    public class CORSConfiguration {
       @Bean
       public WebMvcConfigurer corsConfigurer() {
           return new WebMvcConfigurerAdapter() {
               @Override
               public void addCorsMappings(CorsRegistry registry) {
                   registry.addMapping("/**")
                           .allowedHeaders("*")
                           .allowedMethods("*")
                           .allowedOrigins("*");
               }
           };
       }

   }}
