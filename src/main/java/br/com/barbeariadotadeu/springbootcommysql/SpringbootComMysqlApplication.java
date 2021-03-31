package br.com.barbeariadotadeu.springbootcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.barbeariadotadeu.springbootcommysql")
@EntityScan(basePackages = "br.com.barbeariadotadeu.springbootcommysql.model")
public class SpringbootComMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootComMysqlApplication.class, args);
	}

}
