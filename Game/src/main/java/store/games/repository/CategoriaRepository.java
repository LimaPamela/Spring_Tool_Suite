package store.games.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import store.games.model.Categoria;

public interface CategoriaRepository {

	@Repository
	public interface CategoryRepository extends JpaRepository<Categoria, Long> {

		public List<Categoria>findAllByTipoContainingIgnoreCase(@Param("Tipo")String tipo);

	}

}
