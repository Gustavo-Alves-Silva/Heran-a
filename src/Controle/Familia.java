package Controle;

import java.util.ArrayList;

public class Familia extends Ordem{

	public Familia(String nomeReino,String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia) {
		super(nomeReino,nomeFilo, nomeClasse, nomeOrdem);
		setNomeFamilia(nomeFamilia);
	}
	
	private Ordem ordem;

	public ArrayList<Genero> getGeneros() {
		return Generos;
	}

	public void setGeneros(ArrayList<Genero> generos) {
		Generos = generos;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	private ArrayList<Genero> Generos = new ArrayList<Genero>();
	
}
