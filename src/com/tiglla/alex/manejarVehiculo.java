package com.tiglla.alex;

public interface manejarVehiculo {
	
	double aumento=2;
	//metodo abstracto -- nos obliga a implementar una funcionalidad en la clase hija
	//metodo dedaul-- implementare en la interface y no hay necesidad de en la hija
	//mestodo estatic-- pertenece a la interface
	
	abstract void acelerar();
	abstract void desacelerar();
	
	

}
