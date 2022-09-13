package store.games.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import store.games.model.Produto;

public interface ProdutoRepository {

	@Repository
	public interface ProductRepository extends JpaRepository<Produto, Long>{

		public List<Produto>findAllByNomeContainingIgnoreCase(@Param("Nome")String nome);
	}

}
