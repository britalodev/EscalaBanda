package br.com.vpc.repository.escala;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.vpc.escala.model.Escala;

public interface EscalaRepository extends PagingAndSortingRepository<Escala, Long>{

	List<Escala> findByDataIgnoreCaseContaining(String data);

}
