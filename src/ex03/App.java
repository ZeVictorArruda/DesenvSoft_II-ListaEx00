package ex03;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de cavalos comprados: ");
		int numeroCavalos = sc.nextInt();
		
		System.out.printf("Serão necessárias %d ferraduras para equipar os %d cavalos.", numeroCavalos*4, numeroCavalos);
		
		
		sc.close();
	}

}
