package br.com.comercial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comercial.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long>{

	Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);
	//com isso a implementacao é feita automaticamente
}
