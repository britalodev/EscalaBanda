package br.com.vpc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.vpc.instrumentos.model.Instrumento;
import br.com.vpc.membros.model.Ministro;

public interface MinistroRepository extends PagingAndSortingRepository<Ministro, Long>{

	List<Instrumento> findByNomeIgnoreCaseContaining(String nome);

}
