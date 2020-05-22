package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	
	PApplet app;
	Logic logica;

	public Controller(PApplet app) {
		this.app = app;
		logica= new Logic(app);
		
	}

	public void pintar() {
		logica.pintar();
		
	}
	
	public void sortList(char c) {
		logica.sortList(c);
			
		}
}
