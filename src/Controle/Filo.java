package Controle;

import java.util.ArrayList;

public class Filo extends Reino{

	private Reino reino;


	public Filo(String reino, String nomeFilo) {
		super(reino);
		setNomeFilo(nomeFilo);

	}

	public ArrayList<Classe> getClasses() {
		return Classes;
	}

	public void setClasses(ArrayList<Classe> classes) {
		Classes = classes;
	}
	
	public Reino getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = new Reino(reino);
	}

	private ArrayList<Classe> Classes = new ArrayList<Classe>();
	
}
