package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping("/hello-world")
	public String hello () {
		return " Hello World !!!";
	}
	
	@GetMapping("/BSM")
	public String bsm() {
		return " 1-Orientação ao futuro. \n 2-Responsabilidade Pessoal \n 3-Mnetalidade de Crescimento. \n 4-Persistência. \n 5-Trabalho em equipe. \n 6-Atenção aos detalhes. \n 7-Proatividade. \n 8-Comunicação.";
	}
	@GetMapping("/Objetivo")
	public String objetivo() {
		return " Meu Objetivo é desenvolver as BSM's e aplicar no meu dia-a-dia !! ";
	}
}
