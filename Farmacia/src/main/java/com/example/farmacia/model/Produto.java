package com.example.farmacia.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@NotNull(message="O atributo identificação é obrigatório")
	private String identificacao;
	
	private Double valor;
	private int estoque;
	private String validade;
	private String lote;
	private String descricao;
	
	
	@OneToMany
	@JsonIgnoreProperties("Produto")
	private List<Categoria> categoria;

	
}
