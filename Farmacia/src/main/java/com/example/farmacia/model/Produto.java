package com.example.farmacia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="tb_produto")
@Getter
@Setter
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotNull(message="O atributo identificação é obrigatório")
	private String identificacao;
	
	private Double valor;
	private int estoque;
	private String validade;
	private String Lote;
	private String ind_uso;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

}
