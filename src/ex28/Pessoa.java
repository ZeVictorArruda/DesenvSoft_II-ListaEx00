package ex28;

public class Pessoa {
	
	private String nome, nomePai, nomeMae;
	private int idade;
	
	public Pessoa(String nome, String nomePai, String nomeMae, int idade) {
		this.nome = nome;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", idade=" + idade + "]";
	}

}
