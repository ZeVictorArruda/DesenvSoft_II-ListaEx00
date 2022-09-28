package ex05;

public class Triangulo {
	private double catetoAdj, catetoOp, hipotenusa;
	
	public Triangulo() {
		
	}
	
	
	
	public Triangulo(double catetoAdj, double catetoOp) {
		this.catetoAdj = catetoAdj;
		this.catetoOp = catetoOp;
		this.hipotenusa = calcHipotenusa(catetoAdj, catetoOp);
	}



	public double getCatetoAdj() {
		return catetoAdj;
	}



	public void setCatetoAdj(double catetoAdj) {
		this.catetoAdj = catetoAdj;
	}



	public double getCatetoOp() {
		return catetoOp;
	}



	public void setCatetoOp(double catetoOp) {
		this.catetoOp = catetoOp;
	}



	public double getHipotenusa() {
		return hipotenusa;
	}



	public double calcHipotenusa(double catetoAdj, double catetoOp) {
		double hip = Math.pow(catetoAdj, 2) + Math.pow(catetoOp, 2);
		return Math.sqrt(hip);
		
	}



	@Override
	public String toString() {
		return String.format("O triangulo com cateto adj %.2f e cateto oposto %.2f tem hipotenusa de: %.2f",
				getCatetoAdj(), getCatetoOp(), getHipotenusa());
	}

	


	
	
}
