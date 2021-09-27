package br.com.tema.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CartaController {
	
	private static final String ENDPOINT = "/api/carta";
	
	//cadastrar carta 
	@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)
	public ResponseEntity<String> post() {
		//TODO
		
		return ResponseEntity.status(HttpStatus.OK).body("Carta cadastrada com sucesso!");
	}
	
	//edição carta 
		@RequestMapping(value = ENDPOINT, method = RequestMethod.PUT)
		public ResponseEntity<String> put() {
			//TODO
			
			return ResponseEntity.status(HttpStatus.OK).body("Carta atualizada com sucesso!");
		}
		
	//busca carta 
		@RequestMapping(value = ENDPOINT, method = RequestMethod.GET)
		public ResponseEntity<String> get() {
			//TODO
			
			return ResponseEntity.status(HttpStatus.OK).body("Consulta realizada com sucesso!");
		}
		
	//deletar carta 
		@RequestMapping(value = ENDPOINT, method = RequestMethod.DELETE)
		public ResponseEntity<String> delete() {
			//TODO
			
			return ResponseEntity.status(HttpStatus.OK).body("Carta excluida com sucesso!");
		}
}
