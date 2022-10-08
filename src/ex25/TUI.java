package ex25;

import java.util.Scanner;

public class TUI {
	
	private int x, y, z;
	private Scanner sc;
	private Ponto p1, p2;
	private double distanciaPontos;
	private Metodos mtd;
	
	public TUI() {
		sc = new Scanner(System.in);
	}
	
	private void printTUI() {
		System.out.println("Coord X do P1: ");
		setX(sc.nextInt());
		System.out.println("Coord y do P1: ");
		setY(sc.nextInt());
		System.out.println("Coord z do P1: ");
		setZ(sc.nextInt());
		
		setP1(new Ponto(x, y, z));
		
		System.out.println("Coord X do P2: ");
		setX(sc.nextInt());
		System.out.println("Coord y do P2: ");
		setY(sc.nextInt());
		System.out.println("Coord z do P2: ");
		setZ(sc.nextInt());
		
		setP2(new Ponto(x, y, z));
		
	}
	
	private void solve() {
		setDistanciaPontos(mtd.calculaDistancia());
	}
	
	public void printResults() {
		System.out.println("A distancia é " + getDistanciaPontos());
	}
	
	public void tui() {
		printTUI();
        solve();
        printResults();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public Ponto getP1() {
		return p1;
	}

	public void setP1(Ponto p1) {
		this.p1 = p1;
	}

	public Ponto getP2() {
		return p2;
	}

	public void setP2(Ponto p2) {
		this.p2 = p2;
	}

	public double getDistanciaPontos() {
		return distanciaPontos;
	}

	public void setDistanciaPontos(double doubleDistanciaPontos) {
		this.distanciaPontos = doubleDistanciaPontos;
	}

	@Override
	public String toString() {
		return "TUI [x=" + x + ", y=" + y + ", z=" + z + ", sc=" + sc + ", p1=" + p1 + ", p2=" + p2
				+ ", doubleDistanciaPontos=" + distanciaPontos + "]";
	}
	
	
	
}
