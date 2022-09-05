package com.example.farmacia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotBlank(message="O atributo tipo é obrigatório e não pode utilizar espaços em branco")
    @Size(min= 2, max=100, message="O campo precisa ter no minimo 4 letras e no maximo 100 letras")
    private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Categoria getProduto() {
			return null;
	}

}
