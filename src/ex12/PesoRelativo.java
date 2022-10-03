package ex12;

public class PesoRelativo {
	private double pesoRelativo, gRelativa;
	private String planeta;
	
	public PesoRelativo(int opc, double pesoTerra) {
		gRelaPlaneta(opc);
		this.pesoRelativo = this.gRelativa * (pesoTerra / 10);
		mostraResultados();
		
	}
	
	public void gRelaPlaneta(int opc) {
		
		switch(opc) {
		
		case 1:
			this.gRelativa = 0.37;
			this.planeta = "Mercúrio";
			break;
		
		case 2:
			this.gRelativa = 0.88;
			this.planeta = "Vênus";
			break;
		
		case 3:
			this.gRelativa = 0.38;
			this.planeta = "Marte";
			break;
			
		case 4:
			this.gRelativa = 2.64;
			this.planeta = "Júpiter";
			break;
		
		case 5:
			this.gRelativa = 1.15;
			this.planeta = "Saturno";
			break;
			
		case 6:
			this.gRelativa = 1.17;
			this.planeta = "Urano";
			break;
			
		default:
			System.out.println("Usa direito!");
			break;
		
		}
		
		
	}
	
	public void mostraResultados() {
		System.out.printf("Seu peso no planeta %s é %.2f.", planeta, pesoRelativo);
	}
	
}
