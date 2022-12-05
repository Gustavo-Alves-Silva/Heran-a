package Controle;

import java.util.ArrayList;

public class Ordem extends Classe{

	public Ordem(String nomeFilo, String nomeClasse,String nomeReino,String nomeOrdem) {
		super(nomeReino, nomeFilo, nomeClasse);
		setNomeOrdem(nomeOrdem);
	}
	
	private Classe classe;
	private ArrayList<Familia> Familias = new ArrayList<Familia>();

	public ArrayList<Familia> getFamilias() {
		return Familias;
	}

	public void setFamilias(ArrayList<Familia> familias) {
		Familias = familias;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = new Classe(classe.getFilo().getReino().getNomeReino(), classe.getFilo().getNomeFilo(), classe.getNomeClasse());
	}


	
}
