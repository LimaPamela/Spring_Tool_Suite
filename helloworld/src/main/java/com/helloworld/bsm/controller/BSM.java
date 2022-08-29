package com.helloworld.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM")

public class BSM {
	@GetMapping
	public String bsm() {
		return " 1-Orientação ao futuro. \n 2-Responsabilidade Pessoal \n 3-Mnetalidade de Crescimento. \n 4-Persistência. \n 5-Trabalho em equipe. \n 6-Atenção aos detalhes. \n 7-Proatividade. \n 8-Comunicação.";
	}

}
