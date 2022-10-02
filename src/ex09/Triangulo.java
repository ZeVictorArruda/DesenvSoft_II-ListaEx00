package ex09;

public class Triangulo {
	private double lado1, lado2, lado3;
	
	public Triangulo() {
		
	}
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	
	public String tipoTriangulo() {
		if (lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1+lado2){
			if (lado1 == lado2 && lado1 == lado3){
				return "Três lados iguais . Trata-se de um Triangulo Equilatero";
			}else if(lado1 == lado2 || lado1 == lado3){
				return "Dois lados iguais . Trata-se de um Triangulo Isosceles";
				}else
				return "Três lados diferentes. Trata-se de um Triangulo Escaleno";
		} else {
			return "Não é um triângulo.";
		}
		
	}

}
