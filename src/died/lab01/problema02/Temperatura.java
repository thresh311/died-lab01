package died.lab01.problema02;

public class Temperatura {
	
	protected double grados;
	protected Escala escala;
	
	public Temperatura() {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	public String toString() {
		
		if(this.escala == Escala.CELCIUS) {
			return this.grados + " C*";
		} else {
			return this.grados + " F*";
		}
		
	}
	
	public double asCelcius() {
		if (this.escala == Escala.CELCIUS) {
			return this.grados;
		} else {
			return ((this.grados - 32) * 5) / 9;
		}
	}
	
	public double asFahrenheit() {
		if (this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		} else {
			return ((this.grados * 9)/5) + 32;
		}
	}
	
	public boolean mayorACero() {
		return this.grados > 0;
	}
	
	public boolean mismaEscala (Escala escala) {
		return this.escala == escala;
	}
	
	public void aumentar (Temperatura temperatura) {
		if (temperatura.mayorACero()) {
			if (this.mismaEscala(temperatura.escala)) {
				this.grados += temperatura.grados;
			} else {
				if(this.escala == Escala.CELCIUS) {
					this.grados += temperatura.asCelcius();
				} else {
					this.grados += temperatura.asFahrenheit();
				}
			}
		}
	}
	
	public void disminuir (Temperatura temperatura) {
		if (temperatura.mayorACero()) {
			if (this.mismaEscala(temperatura.escala)) {
				this.grados -= temperatura.grados;
			} else {
				if(this.escala == Escala.CELCIUS) {
					this.grados -= temperatura.asCelcius();
				} else {
					this.grados -= temperatura.asFahrenheit();
				}
			}
		}
	}
	
}
