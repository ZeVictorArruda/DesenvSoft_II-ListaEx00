package ex11;

import java.util.Scanner;

public class TUI {
	private double nota1, nota2;
	private Scanner sc;
	private CalculaNotas cn;
	private Notas notas;
	private String resultado;
	
	public TUI() {
		sc = new Scanner(System.in);
	}
	
	public void printTUI() {
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextDouble();
	}
	
	public void solve() {
		cn = new CalculaNotas();
		notas = new Notas(nota1, nota2);
		resultado = cn.resultado();
		
	}
	
	public void printResults() {
		System.out.println(resultado);
	}
	
	public void tui() {
		printTUI();
		solve();
		printResults();
		
	}
	

}
