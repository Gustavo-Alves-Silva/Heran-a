package Controle;

import java.util.ArrayList;

public class Reino extends SeresVivos{
	
	private ArrayList<Filo> Filos = new ArrayList<Filo>();
	
	public Reino(String reino) {
		setNomeReino(reino);
	}

	public ArrayList<Filo> getFilos() {
		return Filos;
	}

	public void setFilos(ArrayList<Filo> filos) {
		Filos = filos;
	}
	
	
}
