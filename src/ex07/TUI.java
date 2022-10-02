package ex07;

import java.util.Scanner;

public class TUI {
	private Losango losango;
	private Scanner sc;
	private double diagonalMaior, diagonalMenor, area;
	
	public TUI() {
		this.losango = new Losango(diagonalMaior, diagonalMenor);
		this.sc = new Scanner(System.in);
	}
	
	public void printTUI() {
		System.out.println("Entre a diagonal maior do losango: ");
		diagonalMaior = sc.nextDouble();
		System.out.println("Entre a diagonal menor do losango: ");
		diagonalMenor = sc.nextDouble();
	}
	
	public void solve() {
		losango.setDiagonalMaior(diagonalMaior);
		losango.setDiagonalMenor(diagonalMenor);
		area = losango.areaLosango();
	}
	
	public void printResults() {
		System.out.println("A área do losango é: " + this.area);
	}
	
	public void tui() {
		printTUI();
		solve();
		printResults();
	}
	
}
