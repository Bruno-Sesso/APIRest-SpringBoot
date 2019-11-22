package com.montanha.gerenciador.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/viagens")
public class GerenciadorViagemController {
	
//	@Autowired
//	private ViagemServices viagemService;
	
	@PostMapping(path = "/new")
	public ResponseEntity<Response<Viagem>> cadastrar(){
		
	}
}
