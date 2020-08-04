package com.slabiakt.xloadrestproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class XloadRestProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(XloadRestProxyApplication.class, args);
	}

}
