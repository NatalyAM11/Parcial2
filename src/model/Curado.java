package model;

import processing.core.PApplet;

public class Curado extends Persona {
	
	public Curado (int posX,int posY, String tipo, PApplet app) {
		super(posX,posY,tipo,app);
		this.r=0;
		this.g=0;
		this.b=255;
	}
	
	
	public void pintar() {
		//if(tipo==1) {
		app.noStroke();
		app.fill(r,g,b);
		app.ellipse(posX, posY, tam, tam);
		//}
	}


	//Hilo
	public void run() {
		try {
			
			mover(); 
			
			
		}catch(IndexOutOfBoundsException  e) {
			
		}catch (Exception e) {
			
		}
		
	}


	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
