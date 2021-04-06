package Clase1;

public class Persona {

	protected short edad;
	protected String nombre; //Es visible para su hijos
	protected double altura; //Es visible para sus hijos
	
	public Persona(short edad, String nombre, double altura) {
		this.edad = edad;
		this.setNombre(nombre);
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
