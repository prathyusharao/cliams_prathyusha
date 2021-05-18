package com.claims;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;



/*
 * Main
 */
@SpringBootApplication
@EnableWebSecurity
@EnableEurekaClient
public class SubmitClaimsApplication {
	/*Access to XMLHttpRequest at 'http://localhost:9090/member/getMember/[object%20Object]' from origin 'http://localhost:4200' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource.
	 * logger statements
	 */
	private static Logger logger = LogManager.getLogger(SubmitClaimsApplication.class);
     /*
      * Startup
      */
	public static void main(String[] args) {
		logger.info("Start Up Of the Application");
		SpringApplication.run(SubmitClaimsApplication.class, args);
	}

}
