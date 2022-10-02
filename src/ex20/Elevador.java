package ex20;

public class Elevador {
	private int andarAtual, totalAndares, qtdPessoas, capacidadeMax;
	

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	public void entra(int entrada) {
		if (qtdPessoas < capacidadeMax && (qtdPessoas + entrada) < capacidadeMax ) {
			qtdPessoas += entrada;
		} else {
			System.out.printf("Lotação máxima alcançada. Apenas %d pode(em) entrar.", capacidadeMax - qtdPessoas);
		}
		
	}
	
	public void sai(int saida) {
		if (qtdPessoas > 0) {
			qtdPessoas -= saida;
		} else {
			System.out.println("Quantidade de saída inválida.");
		}
	}
	
	public void sobeAndar (int sobe) {
		if (andarAtual < totalAndares && (andarAtual + sobe) < totalAndares) {
			andarAtual += sobe;
		}
	}
	
	public void desceAndar (int desce) {
		if (andarAtual > 0 && (andarAtual - desce) > 0) {
			andarAtual -= desce;
		}
	}
	

}
