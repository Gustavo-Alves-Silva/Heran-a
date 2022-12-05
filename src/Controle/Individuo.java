package Controle;

public class Individuo extends Especie{

	public Individuo(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia,
			String nomeGenero, String nomeEspecie, String nomeIndiviuo) {
		super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero, nomeEspecie);
		setNomeIndiduo(nomeIndiviuo);
		// TODO Auto-generated constructor stub
	}
	
	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	private Especie especie;

}
