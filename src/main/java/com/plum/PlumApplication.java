package com.plum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("com.plum.*.dao")
public class PlumApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlumApplication.class, args);
	}
}
