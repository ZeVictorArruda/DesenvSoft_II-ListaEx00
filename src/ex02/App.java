package ex02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1, lado2;
		
		System.out.println("Insira o primeiro lado do terreno: ");
		lado1 = sc.nextDouble();
		System.out.println("Insira o segundo lado do terreno: ");
		lado2 = sc.nextDouble();
		
		Terreno t1 = new Terreno(lado1, lado2);
		
		System.out.println(t1.toString());
		
		
		sc.close();
	}

}
