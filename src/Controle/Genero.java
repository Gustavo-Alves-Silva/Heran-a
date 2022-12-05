package Controle;

import java.util.ArrayList;

public class Genero extends Familia{

	public Genero(String nomeReino,String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia, String nomeGenero) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia);
		setNomeGereno(nomeGenero);
	}
	
	private Familia familia;
	
	public ArrayList<Especie> getEspecies() {
		return Especies;
	}

	public void setEspecies(ArrayList<Especie> especies) {
		Especies = especies;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	private ArrayList<Especie> Especies = new ArrayList<Especie>();

}
