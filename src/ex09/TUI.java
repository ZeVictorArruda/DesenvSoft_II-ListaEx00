package ex09;

import java.util.Scanner;

public class TUI {
	private Triangulo triangulo;
	private double lado1, lado2, lado3;
	private Scanner sc;
	private String resposta;
	
	public TUI() {
		this.sc = new Scanner(System.in);
		this.triangulo = new Triangulo();
	}
	
	public void printTUI() {
		System.out.println("Digite o lado 1: ");
		lado1 = sc.nextDouble();
		System.out.println("Digite o lado 2: ");
		lado2 = sc.nextDouble();
		System.out.println("Digite o lado 3: ");
		lado3 = sc.nextDouble();
	}
	
	public void solve() {
		triangulo.setLado1(lado1);
		triangulo.setLado2(lado2);
		triangulo.setLado3(lado3);
		resposta = triangulo.tipoTriangulo();
	}
	
	public void printResults() {
		System.out.printf("O triangulo de lados %.2f, %.2f, %.2f é do tipo: %s", lado1, lado2, lado3, resposta);
	}
	
	public void tui() {
		printTUI();
		solve();
		printResults();
	}
	
}
