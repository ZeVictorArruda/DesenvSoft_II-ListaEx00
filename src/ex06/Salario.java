package ex06;

public class Salario {
	private double salario, salarioMin;
	
	public Salario() {
		
	}
	
	
	public Salario(double salario, double salarioMin) {
		this.salario = salario;
		this.salarioMin = salarioMin;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioMin() {
		return salarioMin;
	}

	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}
	
	

}
