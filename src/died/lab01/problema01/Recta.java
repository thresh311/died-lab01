package died.lab01.problema01;

public class Recta {
	
	private Punto puntoPaso1;
	private Punto puntoPaso2;
	
	public Recta() {
		this.puntoPaso1 = new Punto(0, 0);
		this.puntoPaso2 = new Punto(1, 1);
	}
	
	public Recta(Punto p1, Punto p2) {
		this.puntoPaso1 = p1;
		this.puntoPaso2 = p2;
	}
	
	public float pendiente() {
		return (puntoPaso1.getY() - puntoPaso2.getY())/(puntoPaso1.getX() - puntoPaso2.getX());
	}
	
	public boolean paralelas(Recta otraRecta) {
		return this.pendiente() == otraRecta.pendiente();
	}
	
	public boolean equals(Object otraRecta) {
		
		if(otraRecta instanceof Recta) {
			Recta aux;
			if(this.puntoPaso1.equals(((Recta) otraRecta).puntoPaso1)) {
			aux = new Recta(((Recta) otraRecta).puntoPaso1, this.puntoPaso2);
			} else {
			aux = new Recta(((Recta) otraRecta).puntoPaso1, this.puntoPaso1);
			}
			return (aux.pendiente() == this.pendiente()) && (aux.pendiente() == ((Recta) otraRecta).pendiente());
		} else {
			return false;
		}
	}
	
}
