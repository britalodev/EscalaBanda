package br.com.vpc.musica.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vpc.musica.model.Musica;
import br.com.vpc.repository.MusicaRepository;

@RestController
@RequestMapping("musica")
public class MusicaEndpoint {


private final MusicaRepository musicaDAO;
	
	@Autowired
	public MusicaEndpoint(MusicaRepository musicaDAO) {
		this.musicaDAO = musicaDAO;
	}
	
	@GetMapping
	public ResponseEntity<?> listAll(Pageable pageable){
		return new ResponseEntity<>(musicaDAO.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody List<Musica> musica){
		return new ResponseEntity<>(musicaDAO.saveAll(musica), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Musica musica){
		musicaDAO.save(musica);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Musica musica){
		musicaDAO.deleteById(musica.getId());
		return new ResponseEntity<>(HttpStatus.OK);
	}	
	
}
