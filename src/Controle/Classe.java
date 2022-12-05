package Controle;

import java.util.ArrayList;

public class Classe extends Filo{

	public Classe(String nomeFilo,String nomeReino,String nomeClasse) {
		super(nomeReino, nomeFilo);
		setNomeClasse(nomeClasse);
	}
	
	private Filo filo;
	
	private ArrayList<Ordem> Ordens = new ArrayList<Ordem>();

	public ArrayList<Ordem> getOrdens() {
		return Ordens;
	}

	public void setOrdens(ArrayList<Ordem> ordens) {
		Ordens = ordens;
	}

	public Filo getFilo() {
		return filo;
	}

	public void setFilo(Filo filo) {
		this.filo = new Filo(filo.getReino().getNomeReino(),filo.getNomeFilo());
	}


	

	
}
