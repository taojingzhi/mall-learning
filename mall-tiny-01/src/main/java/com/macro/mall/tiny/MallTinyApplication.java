package com.macro.mall.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MallTinyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MallTinyApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String b:beanDefinitionNames
//             ) {
//            System.out.println(b);
//        }
    }

}
