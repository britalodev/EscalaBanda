package br.com.vpc.membros.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.vpc.instrumentos.model.Instrumento;
import br.com.vpc.repository.AbstractMinistroEntity;

@Entity
public class Ministro extends AbstractMinistroEntity{
	
	private static final long serialVersionUID = 5308358548419790591L;
	private String nome;
	private String funcao;


	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="ministro_id", referencedColumnName="id")
	private List<Instrumento> instrumento;

	public Ministro(String nome, String funcao, List<Instrumento> instrumento) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.instrumento = instrumento;
	}


	public Ministro() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public List<Instrumento> getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(List<Instrumento> instrumento) {
		this.instrumento = instrumento;
	}
}
