package ex23;

public class LampadaTeste {
	
	public static void main(String[] args) {
		Metodos mtd = new Metodos();
		Lampada maisCara, maisPotente;
		Lampada lampada1 = new Lampada("fluorescente", "amarela", "philips", 220, 5, 35);
		Lampada lampada2 = new Lampada("led", "branca", "philips", 220, 15, 8.47);
		
		maisCara = mtd.maisCara(lampada1, lampada2);
		maisPotente = mtd.maisPotente(lampada1, lampada2);
		
		System.out.println("A lampada mais cara é " + maisCara.getMarca());
		System.out.println("A mais potente é " + maisPotente.getMarca());
		
	}

}
