package ex04;

public class Pessoa {
	private int idade, dias;

	public Pessoa() {
		
	}
	
	public Pessoa(int idade, int dias) {
		this.idade = idade;
		this.dias = dias;
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
		this.dias = idade*365;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	

}
