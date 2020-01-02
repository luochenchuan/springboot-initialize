package com.zhuchuansheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 配置扫描DAO的包
 */
@MapperScan("com.zhuchuansheng.dao")
public class SpringbootInitializeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitializeApplication.class, args);
    }

}
