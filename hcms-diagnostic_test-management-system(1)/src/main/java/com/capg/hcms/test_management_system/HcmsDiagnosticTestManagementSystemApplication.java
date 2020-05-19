package com.capg.hcms.test_management_system;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     4/5/2020
-Description              :     DiagnosticTestServiceImpl class implements services for Testmanagement System
*******************************************************************************************************************************/

@SpringBootApplication
public class HcmsDiagnosticTestManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcmsDiagnosticTestManagementSystemApplication.class, args);
	}
	@Bean
	public Random getRandom() {
		return new Random();
	}

}
