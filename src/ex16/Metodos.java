package ex16;

import java.util.Scanner;

public class Metodos {
	private Scanner sc;
	private Pessoa pessoas[];
	
	public Metodos() {
		sc = new Scanner(System.in);
		pessoas = new Pessoa[10];
	}
	
	public void addPessoa(String sexo, double altura) {
		pessoas = new Pessoa[10];
		System.out.println("Digite o sexo (f/m): ");
		sexo = sc.next();
		char s = sexo.charAt(0);
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		Pessoa p = new Pessoa(altura, s);
		
	}

	
}
