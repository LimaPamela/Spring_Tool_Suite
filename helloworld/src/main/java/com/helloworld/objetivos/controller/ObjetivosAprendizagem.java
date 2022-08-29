package com.helloworld.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjetivosAprendizagem")

public class ObjetivosAprendizagem {

	@GetMapping
	public String objetivo() {
		return " Meu Objetivo é desenvolver as BSM's e aplicar no meu dia-a-dia !! ";
	}
}
