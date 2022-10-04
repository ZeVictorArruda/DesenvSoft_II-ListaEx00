package ex23;

public class Metodos {
	
	public Lampada maisCara(Lampada lamp1, Lampada lamp2) {
		
		if(lamp1.getPreco() > lamp2.getPreco()) {
			return lamp1;
		} else if (lamp1.getPreco() < lamp2.getPreco()) {
			return lamp2;
		} else {
			return null;
		}
		
	}
	
	public Lampada maisPotente(Lampada lamp1, Lampada lamp2) {
		
		if(lamp1.getPotencia() > lamp2.getPotencia()) {
			return lamp1;
		} else if (lamp1.getPotencia() < lamp2.getPotencia()) {
			return lamp2;
		} else {
			return null;
		}
		
	}
	

}
