package br.com.tema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.tema")
public class ProjetoTemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTemaApplication.class, args);
	}

}
