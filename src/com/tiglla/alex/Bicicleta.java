package com.tiglla.alex;

public class Bicicleta extends Vehiculo implements manejarVehiculo {

	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas) {
		super(anio, marca, modelo, color, ruedas);
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		System.out.println("Acelerando...");
		velocidad +=.5;
		System.out.println(velocidad);
		
	}

	public void desacelerar() {
		System.out.println("Desacelerando...");
		velocidad -=.5;
		System.out.println(velocidad);
		
	}

	
		


}
