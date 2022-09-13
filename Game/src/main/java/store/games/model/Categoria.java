package store.games.model;

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

public class Categoria {
	@Getter
	@Setter
	@Entity
	@Table(name = "tb_categoria")
	public class Category {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		@NotNull
		private String tipo;

		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Usuario usuario;
	    
	    @ManyToOne
	   	@JsonIgnoreProperties("produto")
	   	private Produto produto;

	
	}

}
