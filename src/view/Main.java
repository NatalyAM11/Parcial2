package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	Controller controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(800,500);
	}
	
	public void setup() {
		
		controller= new Controller(this);
		
	}
	
	public void draw() {
		
	background(0);
		
		controller.pintar();
		
	}
}
