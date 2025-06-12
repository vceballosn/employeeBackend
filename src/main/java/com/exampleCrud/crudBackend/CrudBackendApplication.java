package com.exampleCrud.crudBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // Keep this one!
// import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer; // REMOVE THIS IMPORT!

// If you're using JPA, keep these, otherwise, ensure they're necessary
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient // This makes your application a Eureka client
//@ComponentScan({"com.exampleCrud.crudBackend", "com.exampleCrud.crudBackend.entity"}) // Uncomment if needed for specific component scanning
//@EntityScan("com.exampleCrud.crudBackend.entity") // Uncomment if needed for specific entity scanning
// @EnableTransactionManagement // Uncomment if you are using transactional operations (common with JPA)
public class CrudBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

}