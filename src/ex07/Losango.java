package ex07;

public class Losango {
	private double diagonalMaior, diagonalMenor;

	public Losango(double diagonalMaior, double diagonalMenor) {
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	public double areaLosango() {
		return (diagonalMaior * diagonalMenor) / 2;
	}

}
