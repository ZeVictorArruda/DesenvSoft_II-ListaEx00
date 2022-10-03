package ex13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numInicial, numFinal;
		Metodos mtd;
		
		System.out.println("Digite o número inicial: ");
		numInicial = sc.nextInt();
		System.out.println("Digite o número final: ");
		numFinal = sc.nextInt();
		
		mtd = new Metodos(numInicial, numFinal);
		mtd.printResults();
		
		sc.close();
	}

}
