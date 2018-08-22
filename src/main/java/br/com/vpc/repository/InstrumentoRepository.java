package br.com.vpc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.vpc.instrumentos.model.Instrumento;

public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Long>{

	List<Instrumento> findByInstrumentoIgnoreCaseContaining(String instrumento);

}
