package Controle;

import java.util.ArrayList;

public class Especie extends Genero{

	public Especie(String nomeReino,String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia, String nomeGenero, String nomeEspecie) {
		super(nomeReino,nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero);
		setNomeEspecie(nomeEspecie);
	}
	
	private Genero genero;

	public ArrayList<Individuo> getIndividuos() {
		return individuos;
	}



	public void setIndividuos(ArrayList<Individuo> individuos) {
		this.individuos = individuos;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	private ArrayList<Individuo> individuos = new ArrayList<Individuo>();

}
