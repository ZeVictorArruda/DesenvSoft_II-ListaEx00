package ex15;

import java.util.Scanner;

public class TUI {
	private CalculaTemperatura calctemp;
	private double tempC;
	private Scanner sc;
	private int opc;
	private double tempConvertida;
	
	public TUI() {
		sc = new Scanner(System.in);
	}
	
	public void printTUI() {
		System.out.println("Digite a temperatura em Celsius:");
		tempC = sc.nextDouble();
		System.out.println("Escolha a escala para qual deseja converter:");
		System.out.println("1 - Fahrenheit;\n2 - Réaumur;\n3 - Rankine;\n4 - Kelvin");
		opc = sc.nextInt();
		
		}
	
	public void solve() {
		switch(opc) {
		
		case 1:
			tempConvertida = calctemp.toFahrenheit(tempC);
			break;
			
		case 2:
			tempConvertida = calctemp.toReaumur(tempC);
			break;
			
		case 3:
			tempConvertida = calctemp.toRankine(tempC);
			break;
			
		case 4:
			tempConvertida = calctemp.toKelvin(tempC);
			break;
			
		default:
			System.out.println("Use direito, meu filho!");
			break;
		}
	
	
	}
	
	public void printResults() {
		System.out.println("A temperatura convertida é: " + tempConvertida);
	}
	
	public void tui() {
		printTUI();
		solve();
		printResults();
	}
	
}
