package ex18;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private int anoAtual;
	private double altura;
	public Pessoa(String nome, int anoNasc, double altura) {
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}
	
	public int getIdade(int anoAtual) {
		return anoAtual - anoNasc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoNasc=" + anoNasc + ", idade=" + getIdade(anoAtual) + ", altura=" + altura + "]";
	}
	
}
