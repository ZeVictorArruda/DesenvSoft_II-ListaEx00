package ex24;

public class Apolice {
	private String nomeSegurado;
	private int idade;
	private double premio;
	private String cidade;
	

	public Apolice() {
		
	}
	
	public Apolice(String nomeSegurado, int idade, String cidade) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.cidade = cidade;
		calcularPremio();
	}

	public void calcularPremio() {
		this.premio = 0;
		
		if (idade >= 18 && idade <= 25) {
			this.premio += (premio * 20)/100;
		} else if (idade > 25 && idade <= 36) {
			this.premio += (premio * 15) / 100;
		} else if (idade > 36) {
			this.premio += (premio * 10) / 100;
		}
	}
	
	public void desconto() {
		
		if (this.cidade == "RJ") {
			this.premio = this.premio * 0.85;
		}
		
		if (this.cidade == "CUR") {
			this.premio = this.premio * 0.8;
		}
		
		if (this.cidade == "SP") {
			this.premio = this.premio * 0.9;
		}
		
		if (this.cidade == "BH") {
			this.premio = this.premio * 0.95;
		}
	}
	
	public String getNomeSegurado() {
		return nomeSegurado;
	}
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPremio() {
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}

}
