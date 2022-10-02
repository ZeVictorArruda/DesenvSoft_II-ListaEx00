package ex06;

import java.util.Scanner;

public class TUI {
	private double salarioMin, salarioFuncionario;
	private Scanner sc;
	Salario salario;
	CalculaSalario cs;
	private double salsEmSalMin;
	
	public TUI() {
		this.sc = new Scanner (System.in);
		this.salario = new Salario();
		this.cs = new CalculaSalario();
		this.salarioFuncionario = 0;
	}
	
	public void printTUI() {
		System.out.println("Digite o salário do funcionário: ");
		this.salarioFuncionario = sc.nextDouble();
		System.out.println("Digite o valor do salário mínimo: ");
		this.salarioMin = sc.nextDouble();
	}
	
	public void solve() {
		salario.setSalario(salarioFuncionario);
		salario.setSalarioMin(salarioMin);
		salsEmSalMin = cs.salariosMin(salario);
	}
	
	public void printResults() {
		System.out.println("A pessoa recebe " + salsEmSalMin + " salários mínimos.");
	}
	
	public void tui() {
		printTUI();
		solve();
		printResults();
	}
}
