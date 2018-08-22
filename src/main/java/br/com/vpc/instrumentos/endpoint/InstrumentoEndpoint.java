package br.com.vpc.instrumentos.endpoint;

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

import br.com.vpc.instrumentos.model.Instrumento;
import br.com.vpc.repository.instrumentos.InstrumentoRepository;

@RestController
@RequestMapping("instrumentos")
public class InstrumentoEndpoint {
	
	private final InstrumentoRepository instrumentoDAO;
	
	@Autowired
	public InstrumentoEndpoint(InstrumentoRepository instrumentoDAO) {
		this.instrumentoDAO = instrumentoDAO;
	}
	
	@GetMapping
	public ResponseEntity<?> listAll(Pageable pageable) {
		return new ResponseEntity<>(instrumentoDAO.findAll(pageable), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody List<Instrumento> instrumento) {
		return new ResponseEntity<>(instrumentoDAO.saveAll(instrumento), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Instrumento instrumento){
		instrumentoDAO.save(instrumento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Instrumento instrumento){
		instrumentoDAO.deleteById(instrumento.getId());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
