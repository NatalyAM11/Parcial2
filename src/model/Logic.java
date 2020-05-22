package model;

import java.util.Collections;
import java.util.LinkedList;

import Exceptions.FirstException;
import processing.core.PApplet;

public class Logic {
	
	PApplet app;
	
	
	//variables para la lista
	protected String[] lista; 
	protected String[] listaSplited;
	
	protected int cantidad; 
	protected String variable;
	
	LinkedList <Persona> personas;
	LinkedList <Persona> sanas;
	protected int posX, posY;
	String tipo;
	
	//cone esto iba a controlar la excepcion
	boolean sano;
	
	//comparator
		private CompararNumero compararNumero;
	
	
	public Logic (PApplet app ) {
		
		this.app=app;
		posX= (int) app.random(25,300);
		posY= (int) app.random(25,300);
		
		
		personas= new LinkedList <Persona>();
		
		
		 //cargo el txt 
		 lista= app.loadStrings("../data/TXTParcial2.txt");
		
		
		crear();
		
		
		//Ordenamiento parcial-Comparator
		 compararNumero= new CompararNumero();
		
	}
	
	//Cargo todo
	 public void crear() {
		 
			for (int i=0; i<lista.length;i++) {
				 listaSplited=lista[i].split(",");
				 
				 //lo paso a int 
			     cantidad=Integer.parseInt(listaSplited[1]);
			     
			 	
			   
			     variable=listaSplited[0];
			     
			     //Queria igualar la variable del para el texto pero me enrede 
			    // personas.get(i).getTipo()=variable;
			    
			     if(variable.contentEquals("infectadas")){
					 personas.add(new Contagiado(posX,posY,tipo,app));
					 
				 }else {
					 personas.add(new Curado(posX,posY,tipo,app));
				 }
			     
			 	for (int j=0; j<cantidad;j++) {
			     if(variable.contentEquals("sanas")){
			    	 personas.add(new Sano(posX,posY,tipo,app));
			    
			 	}
			 	}
			}
			     
				
	 }

	public void pintar() {
	
				
			 //pinto las figuras
			 for (int i=0; i<personas.size();i++) {
				personas.get(i).pintar();
				
				//Hilo
				new Thread (personas.get(i)).start();
			
			 }
			 
			 
			 
			 choque();
			 
			 
		
			 //Excepcion
			 
			 try {
				 
				 seContagio();
			 }	catch(FirstException e) {
				 System.out.println(e.getMessage());
		       
				}
	}
	
	
	//metodo para hacer el ordenamiento
	public void sortList(char c) {
	
		
		switch(c) {
		case 'n':
			
			
			Collections.sort(personas);

			
			break;
			
		
		case 'p': 
			
			Collections.sort(personas,compararNumero);
			
		 
			
			
			break;
	
	}
	}
		
		
	
	
	public void choque() {
		
		for(int i=0;i<personas.size();i++) {
			 for(int j=0;j<personas.size();j++) {
				 
				 
				//queria cambiar el color ....pero no me dieron bien los calculos
				 if(app.dist(personas.get(j).getPosX(),personas.get(j).getPosY(),personas.get(i).getPosX(),personas.get(i).getPosY())<=35) {
					// personas.get(j).setR(255);
					 //personas.get(j).setG(0);
					 sano=false;
					

				 }
			 }
		}
		
	}
	
	
	
	//esta seria la excepcion 
	
	public void seContagio() throws FirstException {
		
		if (sano=false) {
			 throw new FirstException("Contagiado");
		}
		
	}
}
