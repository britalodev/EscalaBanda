package br.com.vpc.escala.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import br.com.vpc.membros.model.Ministro;
import br.com.vpc.musica.model.Musica;
import br.com.vpc.repository.escala.AbstractEscalaEntity;

@Entity
public class Escala extends AbstractEscalaEntity{

	private static final long serialVersionUID = -5762732433505035511L;
	
	private String data;

	@ManyToMany
	private List<Ministro> ministros;
	
	@ManyToMany
	private List<Musica> musicas;
	
	

	public Escala() {}



	public Escala(String data, List<Ministro> ministros, List<Musica> musicas) {
		super();
		this.data = data;
		this.ministros = ministros;
		this.musicas = musicas;
	}



	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

	public List<Ministro> getMinistros() {
		return ministros;
	}



	public void setMinistros(List<Ministro> ministros) {
		this.ministros = ministros;
	}



	public List<Musica> getMusicas() {
		return musicas;
	}



	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		Escala other = (Escala) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
