package com.example.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotBlank(message="O atributo tipo é obrigatório e não pode utilizar espaços em branco")
    @Size(min= 2, max=100, message="O campo precisa ter no minimo 4 letras e no maximo 100 letras")
    private String descricao;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Produto produto;
   	
	
}
