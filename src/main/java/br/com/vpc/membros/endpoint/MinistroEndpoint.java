package br.com.vpc.membros.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vpc.membros.model.Ministro;
import br.com.vpc.repository.InstrumentoRepository;
import br.com.vpc.repository.MinistroRepository;

@RestController
@RequestMapping("membros")
public class MinistroEndpoint {

private final MinistroRepository ministroDAO;

	@Autowired
	public MinistroEndpoint(MinistroRepository ministroDAO, InstrumentoRepository instrumentoDAO) {
		this.ministroDAO = ministroDAO;
	}

	@GetMapping
	public ResponseEntity<?> listAll(Pageable pageable){
		return new ResponseEntity<>(ministroDAO.findAll(pageable), HttpStatus.OK);
	}
	
	@GetMapping(path="/membro/{nome}")
	public ResponseEntity<?> findByNome(@PathVariable String nome){
		return new ResponseEntity<>(ministroDAO.findByNomeIgnoreCaseContaining(nome), HttpStatus.OK);
	}
	
	@GetMapping(path= "/{id}")
	public ResponseEntity<?> finById(@PathVariable("id") Long id){
		return new ResponseEntity<>(ministroDAO.findById(id), HttpStatus.OK);
	}
	
	@PostMapping(path= "/salvarLista")
	public ResponseEntity<?> saveList(@RequestBody List<Ministro> ministro){
		return new ResponseEntity<>(ministroDAO.saveAll(ministro), HttpStatus.CREATED);		
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Ministro ministro){
		ministroDAO.save(ministro);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Ministro ministro){
		ministroDAO.deleteById(ministro.getId());
		return new ResponseEntity<>(HttpStatus.OK);
	}	
}
