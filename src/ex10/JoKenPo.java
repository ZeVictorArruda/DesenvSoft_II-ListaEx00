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
				resultado = "Você perdeu!";
				break;
			
			case "Tesoura":
				resultado = "Você venceu!";
				break;
			
			default:
				resultado = "Cê é burro?";
			
			
			}
			break;
		
		case "Papel":
			
			switch(jogadaPC) {
			
			case "Pedra":
				resultado = "Você venceu!";
				break;
			
			case "Papel":
				resultado = "Empate!";
				break;
			
			case "Tesoura":
				resultado = "Você perdeu!";
				break;
			
			default:
				resultado = "Cê é burro?";
			
			
			}
			break;
			
		case "tesoura":
			
			switch(jogadaPC) {
			
			case "Pedra":
				resultado = "Você perdeu!";
				break;
			
			case "Papel":
				resultado = "Você venceu!";
				break;
			
			case "Tesoura":
				resultado = "Empate!";
				break;
			
			default:
				resultado = "Cê é burro?";
			
			}
			break;	
			
		default:
			resultado = "Cê é burro?";
		}
		return resultado;
	}

}
