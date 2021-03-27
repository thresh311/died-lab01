package died.lab01.problema01;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if(otroPunto.getClass() == Punto.class) {
			return ((this.x == ((Punto) otroPunto).getX()) && (this.y == ((Punto) otroPunto).getY()));
		} else {
			return false;
		}
	}
	
}
