package ex25;

public class Metodos {
	
	private Ponto p1, p2;
	
	public Metodos(Ponto p1, Ponto p2) {
		this.p1 = p1;
		this.p2 = p2;
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
	
	public double calculaDistancia() {
		double distancia = 0, xPart = 0, yPart = 0, zPart = 0;
		xPart = Math.pow((p2.getX() - p1.getX()), 2);
		yPart = Math.pow((p2.getY() - p1.getY()), 2);
		zPart = Math.pow((p2.getZ() - p1.getZ()), 2);
		distancia = Math.sqrt(xPart + yPart + zPart);
		
		return distancia;
		
	}

}
