package ex08;

public class Geometria {
	public static double distancia(Ponto p1, Ponto p2) {
        double distancia = 0, yPart = 0, xPart = 0;
        xPart = Math.pow((p2.getX() - p1.getX()), 2);
        yPart = Math.pow((p2.getY() - p1.getY()), 2);

        distancia = Math.sqrt(xPart + yPart);
        return distancia;
    }

}
