package ex10;

public class JoKenPo {
	public static String jogadas[] = {"Pedra", "Papel", "Tesoura"};
	private String resultado;
	
	
	public String jogo(String jogadaUSER, String jogadaPC) {
		switch (jogadaUSER) {
		
		case "Pedra":
			
			switch(jogadaPC) {
			
			case "Pedra":
				resultado = "Empate!";
				break;
			
			case "Papel":
				resultado = "Voc� perdeu!";
				break;
			
			case "Tesoura":
				resultado = "Voc� venceu!";
				break;
			
			default:
				resultado = "C� � burro?";
			
			
			}
			break;
		
		case "Papel":
			
			switch(jogadaPC) {
			
			case "Pedra":
				resultado = "Voc� venceu!";
				break;
			
			case "Papel":
				resultado = "Empate!";
				break;
			
			case "Tesoura":
				resultado = "Voc� perdeu!";
				break;
			
			default:
				resultado = "C� � burro?";
			
			
			}
			break;
			
		case "tesoura":
			
			switch(jogadaPC) {
			
			case "Pedra":
				resultado = "Voc� perdeu!";
				break;
			
			case "Papel":
				resultado = "Voc� venceu!";
				break;
			
			case "Tesoura":
				resultado = "Empate!";
				break;
			
			default:
				resultado = "C� � burro?";
			
			}
			break;	
			
		default:
			resultado = "C� � burro?";
		}
		return resultado;
	}

}
