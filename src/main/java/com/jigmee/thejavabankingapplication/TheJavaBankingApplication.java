package com.jigmee.thejavabankingapplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "Java Banking application",
				description = "Backend Rest API for Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Jigmee W Sherpa",
						email = "j.w.sherpa207@gmail.com",
						url = "https://github.com/WangchukSherpa"
				)
		)

)
public class TheJavaBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheJavaBankingApplication.class, args);
	}

}
