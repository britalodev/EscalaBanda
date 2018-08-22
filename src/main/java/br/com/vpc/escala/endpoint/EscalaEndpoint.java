package br.com.vpc.escala.endpoint;

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

import br.com.vpc.escala.model.Escala;
import br.com.vpc.repository.escala.EscalaRepository;

@RestController
@RequestMapping("escala")
public class EscalaEndpoint {
	
	private final EscalaRepository escalaDAO;	
	
	public EscalaEndpoint(EscalaRepository escalaDAO) {
		this.escalaDAO = escalaDAO;
	}

	
	@GetMapping(path="/{data}")
	public ResponseEntity<?> findById(@PathVariable String data){
		return new ResponseEntity<>(escalaDAO.findByDataIgnoreCaseContaining(data), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> listAll(Pageable pageable){
		return new ResponseEntity<>(escalaDAO.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Escala escala){
		return new ResponseEntity<>(escalaDAO.save(escala), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> update(){
		
		return null;
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(){
		
		return null;
	}

	
}