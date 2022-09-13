package store.games.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
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
	    @GeneratedValue (strategy = GenerationType.AUTO)
	    private Long id;

	    @NotBlank
	    private String nome;

	    private int quantidade;
	    
	    @NotNull
	    private double preco;
	   
	    @OneToMany
		@JsonIgnoreProperties("Produto")
		private List<Categoria> categoria;

		
	    
}
