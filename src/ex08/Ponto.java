package ex08;

public class Ponto {
	private double x;
    private double y;

    public Ponto(double x, double y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Ponto2D [x=" + x + ", y=" + y + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
