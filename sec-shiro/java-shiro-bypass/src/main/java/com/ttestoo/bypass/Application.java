package com.ttestoo.bypass;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@ServletComponentScan
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

////开启全路径匹配
//@ServletComponentScan
//@SpringBootApplication
//public class Application extends SpringBootServletInitializer implements BeanPostProcessor {
//    public static void main(String[] args) {
//
//        SpringApplication.run(Application.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Application.class);
//    }
//
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName)
//            throws BeansException {
//        if (bean instanceof RequestMappingHandlerMapping) {
//            ((RequestMappingHandlerMapping) bean).setAlwaysUseFullPath(true);
//        }
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName)
//            throws BeansException {
//        return bean;
//    }
//}