package com.exampleCrud.crudBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@ComponentScan({"com.exampleCrud.crudBackend", "com.exampleCrud.crudBackend.entity"}) // Escanea múltiples paquetes
//@EntityScan("com.exampleCrud.crudBackend.entity") // Asegúrate de incluir @EntityScan también
public class CrudBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

}
