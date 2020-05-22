package model;

import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	
	public Logic (PApplet app ) {
		
		this.app=app;
	}

	public void pintar() {
		app.fill(255);
		app.ellipse(50, 50, 50, 50);
		
	}
}
