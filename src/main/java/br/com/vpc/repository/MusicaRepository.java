package br.com.vpc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.vpc.musica.model.Musica;

public interface MusicaRepository extends PagingAndSortingRepository<Musica, Long>{

	List<Musica> findByNomeMusicaIgnoreCaseContaining(String nomeMusica);

}
