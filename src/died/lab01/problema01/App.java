package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(2,2);
		Recta recta1 = new Recta(p1,p2);
		
		System.out.println(recta1.pendiente());
		
		Punto p3 = new Punto(3,3);
		Recta recta2 = new Recta(p2,p3);
		
		System.out.println(recta1.equals(recta2));
	}

}
