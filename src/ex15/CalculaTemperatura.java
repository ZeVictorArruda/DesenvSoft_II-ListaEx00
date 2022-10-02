package ex15;

public class CalculaTemperatura {
	
	public double toKelvin(double celsius) {
		return celsius + 273;
	}
	
	public double toReaumur(double celsius) {
		return celsius * 0.8;
	}
	
	public double toRankine(double celsius) {
		return celsius * 1.8;
	}
	
	public double toFahrenheit(double celsius) {
		return celsius * 0.8 + 32;
	}
	

}
