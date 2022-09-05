package com.example.farmacia.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private String Lote;
	private String ind_uso;
	
	
	@OneToMany(mappedBy = "produto",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produto")
	private List<Categoria> categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getLote() {
		return Lote;
	}

	public void setLote(String lote) {
		Lote = lote;
	}

	public String getInd_uso() {
		return ind_uso;
	}

	public void setInd_uso(String ind_uso) {
		this.ind_uso = ind_uso;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
	
	
}
