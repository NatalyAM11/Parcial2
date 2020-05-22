package model;

import processing.core.PApplet;

public abstract class Persona implements Runnable, Comparable<Persona> {

	
	PApplet app;
	protected int posX,posY,tam,vel,dirX,dirY,r,g,b,cantidad;
protected String tipo;

	public Persona(int posX,int posY, String tipo, PApplet app) {
		this.app=app;
		this.posX=(int)app.random(25,755);
		this.posY=(int)app.random(25,455);
		this.tam=35;
		this.vel=1;
		this.dirX=1;
		this.dirY=1;
	}
	
	public void pintar () {
		
		
	}
	
	public void mover() {
		
		this.posX += vel * this.dirX;
	    this.posY += vel * this.dirY;




	      if (this.posX >= 775 || this.posX <= 0) {
	            this.dirX *= -1;
	        }
	        if (this.posY >= 475|| this.posY <= 0) {
	            this.dirY *= -1;
	        }
		
	}
	
	public void pintarTexto() {
		app.fill(255);
		
		app.text(tipo, 50,50);
		app.text(cantidad,80,50);
	
	}
	


	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}
	
	
	
	
}
