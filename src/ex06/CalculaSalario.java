package ex06;

public class CalculaSalario {
	private Salario salarios;
	
	public CalculaSalario() {
		
	}

	public Salario getSalarios() {
		return salarios;
	}

	public void setSalarios(Salario salarios) {
		this.salarios = salarios;
	}
	
	public double salariosMin(Salario salarios) {
		return salarios.getSalario() / salarios.getSalarioMin();
	}

}
