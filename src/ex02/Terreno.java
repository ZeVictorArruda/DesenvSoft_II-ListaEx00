package ex02;

public class Terreno {
	private double lado1, lado2;
	
	public Terreno() {
		
	}
	
	public Terreno(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double area(double lado1, double lado2) {
		return lado1*lado2;
	}

	@Override
	public String toString() {
		return "Terreno [Lado 1: " + getLado1() + ", Lado 2: " + getLado2() + ", Área: " + area(lado1, lado2) + "]";
	}
	
	
}
