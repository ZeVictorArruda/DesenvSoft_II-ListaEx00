package ex17;

import java.util.List;

public class Metodos {
	
	private List<Funcionario> funcionario;

    public Metodos(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public void mediaSalarios() {
        double somatorio = 0;
        for (int i = 0; i < funcionario.size(); i++) {
            somatorio += funcionario.get(i).getSalario();
        }
        System.out.println("A media salarial da empresa é de R$:"
                +(somatorio/funcionario.size()));
    }

}
