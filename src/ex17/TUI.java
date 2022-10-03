package ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TUI {
	private double salario;
    private int qtd;
    private Scanner sc;
    private Funcionario funcionario;
    private List<Funcionario> listaFuncionarios;
    private Metodos mtd;

    public Metodos getMtd() {
        return mtd;
    }

    public void setMtd(Metodos mtd) {
        this.mtd = mtd;
    }

    public TUI() {
        sc = new Scanner(System.in);
        listaFuncionarios = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdF() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void printTUI() {
    	
        System.out.println("Digite a quantidade de funcionários: ");
        setQtd(sc.nextInt());
        for (int i = 0; i < getQtdF(); i++) {
            System.out.println("Digite o salario: ");
            setSalario(sc.nextDouble());
            setFuncionario(new Funcionario(getSalario()));
            listaFuncionarios.add(getFuncionario());
        }
    }

    public void printResult() {
 
    	mtd = new Metodos(getListaFuncionarios());
    	mtd.mediaSalarios();
    }
    public void tui(){
    	printTUI();
    	printResult();
    }

}
