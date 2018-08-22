package br.com.vpc.musica.model;

import javax.persistence.Entity;

import br.com.vpc.repository.musica.AbstractMusicaEntity;

@Entity
public class Musica extends AbstractMusicaEntity{
	
	private static final long serialVersionUID = -6561226959868465345L;
	private String nomeMusica;
	private String urlYouTube;
	private String cifraClub;
	private String cifraMelodica;
	
	
	
	public Musica(String nomeMusica, String urlYouTube, String cifraClub, String cifraMelodica) {
		this.nomeMusica = nomeMusica;
		this.urlYouTube = urlYouTube;
		this.cifraClub = cifraClub;
		this.cifraMelodica = cifraMelodica;
	}

	public Musica() {}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getUrlYouTube() {
		return urlYouTube;
	}
	public void setUrlYouTube(String urlYouTube) {
		this.urlYouTube = urlYouTube;
	}
	public String getCifraClub() {
		return cifraClub;
	}
	public void setCifraClub(String cifraClub) {
		this.cifraClub = cifraClub;
	}
	public String getCifraMelodica() {
		return cifraMelodica;
	}
	public void setCifraMelodica(String cifraMelodica) {
		this.cifraMelodica = cifraMelodica;
	}
}
