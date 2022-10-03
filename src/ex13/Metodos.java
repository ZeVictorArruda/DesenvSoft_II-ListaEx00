package ex13;

public class Metodos {
	
	private int numInicial, numFinal, soma, intervalo, impares;
	
	public Metodos(int numInicial, int numFinal) {
		this.numInicial = numInicial;
		this.numFinal = numFinal;
		this.soma = somaNum();
		this.intervalo = intervaloNum();
		this.impares = qtsImpares();
	}
	
	public int somaNum() {
		return this.numInicial + this.numFinal;
	}
	
	public int intervaloNum() {
		return this.numFinal - numInicial;
	}
	
	public int qtsImpares() {
		int n=0;
		for (int i=this.numInicial; i<=this.numFinal; i++) {
			if (i%2 == 1) {
				n += 1;
			}
		}
		return n;
		
	}
	
	public void printResults() {
		System.out.printf("O número inicial é %d, o número final é %d."
				+ " A soma deles é %d, a quantidade de ímpares no intervalo é %d"
				+ " e o intervalo entre eles é de %d inteiros", numInicial, numFinal, soma, impares, intervalo);
	}
	

}
