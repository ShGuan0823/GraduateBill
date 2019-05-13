package com.njupt.ciot.graduatebill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.njupt.ciot.graduatebill.dao")
public class GraduateBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraduateBillApplication.class, args);
	}

}
