package ex10;

import java.util.Random;
import java.util.Scanner;

public class TUI {
	private String jogadaUSER, jogadaPC, resultado;
	private Scanner sc;
	private Random gerador;
	private int codJogadaUSER, codJogadaPC;
	private JoKenPo jkp;
	
	public TUI() {
		sc = new Scanner(System.in);
		gerador = new Random();
		jkp = new JoKenPo();
	}
	
	public void printTUI() {
		System.out.println("JO KEN PO !!!");
		System.out.printf("0 - Pedra;%n1 - Papel;%n2 - Tesoura%n");
		System.out.println("Digite sua jogada: ");
		codJogadaUSER = sc.nextInt();
		codJogadaPC = gerador.nextInt(2);
	}
	
	public void solve() {
		jogadaUSER = JoKenPo.jogadas[codJogadaUSER];
		jogadaPC = JoKenPo.jogadas[codJogadaPC];
		resultado = jkp.jogo(jogadaUSER, jogadaPC);
		
	}
	
	public void printResult() {
		
		if (resultado == "Cê é burro?") {
			System.out.println(resultado);
		}
		
		System.out.printf("%s. Você escolheu %s e o Pc escolheu %s", resultado, jogadaUSER, jogadaPC);
		
	}
	
	public void tui() {
		printTUI();
		solve();
		printResult();
	}

}
