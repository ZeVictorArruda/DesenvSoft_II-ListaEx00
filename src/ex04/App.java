package ex04;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String name = sc.next();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		Pessoa pessoa1 = new Pessoa(idade);
		
		System.out.printf("Olá, %s. Você tem %d anos e viveu %d dias.", name, pessoa1.getIdade(), pessoa1.getDias());
		
		
		sc.close();
	}

}
