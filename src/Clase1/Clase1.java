package Clase1;

public class Clase1 {

	
	public static void main(String[] args) {
		System.out.println("Hi sir 2");
		// TODO Auto-generated method stub
		int a = 720;
		double b = 128.125;
		byte x;
		Persona ar_personas[] = new Persona[3];
		
		x = (byte) a; //Casteo por diferencia de tamano entre datos
		
		a = (int) b;
		/*Se puede utilizar para trabajar con herencia para la transformacion
			Entre tipos de datos 
		*/
		
		Persona uno = new Persona((short) 18, "Juan", 12.5);
		Alumno juan = new Alumno((short) 18, "Pedro", 12.5, 10);
		
		
		ar_personas[0] = uno;
		ar_personas[1] = juan; //Puedo colocar un hijo en el arrglo de personas
		
		System.out.println(ar_personas[1].getNombre());
		
		System.out.println(uno.getNombre());
		
		System.out.println(x);
	}
	
}
