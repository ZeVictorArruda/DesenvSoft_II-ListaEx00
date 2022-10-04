package ex23;

public class Lampada {
	private String tipo, cor, marca;
	private boolean on_off;
	private int tensao; // "voltagem"
	private int potencia;
	private double preco;
	
	public Lampada(String tipo, String cor, String marca, int tensao, int potencia, double preco) {
		this.tipo = tipo;
		this.cor = cor;
		this.marca = marca;
		this.on_off = false;
		this.tensao = tensao;
		this.potencia = potencia;
		this.preco = preco;
	}
	
	public boolean isOn() {
		if (on_off == false) {
			return false;
		} else {
			return true;
		}
	}
	
	public void acender() {
		if (!isOn()) {
			on_off = true;
		} else {
			System.out.println("Lampada já está ligada");
		}	
	}
	
	public void apagar() {
		if (isOn()) {
			on_off = false;
		} else {
			System.out.println("Lampada já está apagada");
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isOn_off() {
		return on_off;
	}

	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Lampada [tipo=" + tipo + ", cor=" + cor + ", marca=" + marca + ", on_off=" + on_off + ", tensao="
				+ tensao + ", potencia=" + potencia + "]";
	}
	
	

}
