package Controle;

import java.util.ArrayList;

public class SeresVivos {
	public String getNomeFilo() {
		return nomeFilo;
	}

	public void setNomeFilo(String nomeFilo) {
		this.nomeFilo = nomeFilo;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

	public String getNomeOrdem() {
		return nomeOrdem;
	}

	public void setNomeOrdem(String nomeOrdem) {
		this.nomeOrdem = nomeOrdem;
	}

	public String getNomeFamilia() {
		return nomeFamilia;
	}

	public void setNomeFamilia(String nomeFamilia) {
		this.nomeFamilia = nomeFamilia;
	}

	public String getNomeGereno() {
		return nomeGereno;
	}

	public void setNomeGereno(String nomeGereno) {
		this.nomeGereno = nomeGereno;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	public String getNomeReino() {
		return nomeReino;
	}

	public void setNomeReino(String nome) {
		this.nomeReino = nome;
	}
	
	public ArrayList<Reino> getReinos() {
		return Reinos;
	}

	public void setReinos(ArrayList<Reino> reinos) {
		Reinos = reinos;
	}
	public String getNomeIndiduo() {
		return nomeIndiduo;
	}

	public void setNomeIndiduo(String nomeIndiduo) {
		this.nomeIndiduo = nomeIndiduo;
	}
	private String nomeIndiduo;
	private String nomeReino;
	private String nomeFilo;
	private String nomeClasse;
	private String nomeOrdem;
	private String nomeFamilia;
	private String nomeGereno;
	private String nomeEspecie;
	private ArrayList<Reino> Reinos = new ArrayList<Reino>();


}
