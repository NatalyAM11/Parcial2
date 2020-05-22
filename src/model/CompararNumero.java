package model;

import java.util.Comparator;

public class CompararNumero implements Comparator <Persona> {

	public CompararNumero() {
		
	}

	


	
	public int compare(Persona o1, Persona o2) {
	
		return o1.getR()-o2.getR();
	}
}