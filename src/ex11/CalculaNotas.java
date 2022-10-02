package ex11;

import java.util.Scanner;

public class CalculaNotas {
	
	private Notas notas;
	private double maiorPrimeiraNota;
	
	public CalculaNotas() {
		
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	public String resultado() {
		double media = (getNotas().getNota1() + getNotas().getNota2()) / 2;
		
		if (media >= 5 && getNotas().getNota1() >= 3 && getNotas().getNota2() >= 3) {
			return "Aprovado";
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Pontuação mínima não atingida.");
			System.out.println("Digite a terceira nota: ");
			notas.setNota3(sc.nextDouble());
			sc.close();
			
			if (getNotas().getNota1() > getNotas().getNota2()) {
				maiorPrimeiraNota = getNotas().getNota1();
			} else {
				maiorPrimeiraNota = getNotas().getNota2();
			}
			
			if (maiorPrimeiraNota + getNotas().getNota3() > 5) {
				return "Aprovado";
			} else {
				return "reprovado";
			}
			
			
		}
		
	}

}
