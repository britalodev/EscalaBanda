package br.com.vpc.instrumentos.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vpc.instrumentos.model.Instrumento;
import br.com.vpc.repository.InstrumentoRepository;

@RestController
@RequestMapping("instrumentos")
public class InstrumentoEndpoint {
	
	private final InstrumentoRepository instrumentoDAO;
	
	@Autowired
	public InstrumentoEndpoint(InstrumentoRepository instrumentoDAO) {
		this.instrumentoDAO = instrumentoDAO;
	}

	@CrossOrigin
	@GetMapping
	public ResponseEntity<?> listAll(Pageable pageable) {
		return new ResponseEntity<>(instrumentoDAO.findAll(pageable), HttpStatus.OK);
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
