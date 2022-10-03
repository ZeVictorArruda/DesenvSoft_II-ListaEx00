package ex12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pesoTerra;
		int opc;
		PesoRelativo pr;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua opção: ");
		opc = sc.nextInt();
		System.out.println("Digite seu peso: ");
		pesoTerra = sc.nextDouble();
		
		pr = new PesoRelativo(opc, pesoTerra);
		
		sc.close();
	}

}
