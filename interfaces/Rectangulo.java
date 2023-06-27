package interfaces;

public class Rectangulo implements Figura {
	
	private double base;
	private double altura;

	public Rectangulo() {
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	public double calcularPerimetro() {
		return 2 * this.base * this.altura;
	}

}
