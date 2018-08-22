package br.com.vpc.instrumentos.model;

import javax.persistence.Entity;

import br.com.vpc.repository.AbstractInstrumentoEntity;

@Entity
public class Instrumento extends AbstractInstrumentoEntity {
	
	private static final long serialVersionUID = -4798079199284272016L;
	
	private String instrumento;
	


	public Instrumento() {}

	public Instrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public String toString() {
		return "Instrumento [instrumento=" + instrumento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((instrumento == null) ? 0 : instrumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrumento other = (Instrumento) obj;
		if (instrumento == null) {
			if (other.instrumento != null)
				return false;
		} else if (!instrumento.equals(other.instrumento))
			return false;
		return true;
	}
}
