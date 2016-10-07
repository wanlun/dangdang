package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/6.
 */

@SpringBootApplication
@ComponentScan({"com.fc","com.wang.controll","com.wang.serivces"})
@MapperScan("com.wang.mapper")
public class Starapplication extends SpringBootServletInitializer {
    public static void main(String[] args){
        System.out.println("启动类启动了");
        SpringApplication.run(Starapplication.class,args);

    }
}
