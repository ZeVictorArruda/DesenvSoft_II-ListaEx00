package ex21;

public class ControleRemoto {
	
	private TV tv;
	
	public ControleRemoto() {
		
	}
	
	public void aumentaVolume() {
		
		if (tv.getVolumeAtual() < tv.getVolumeMax()) {
			tv.setVolumeAtual(tv.getVolumeAtual() + 1);
		} else {
			System.out.println("Volume máximo atingido");
		}
		
	}
	
	public void diminuiVolume() {
		if (tv.getVolumeAtual() > 0) {
			tv.setVolumeAtual(tv.getVolumeAtual()-1);
		} else {
			System.out.println("Volume já está no mínimo");
		}
	}
	
	public void mudaCanal(int canal) {
		tv.setCanalAtual(canal);
	}
	
	public int consultaCanal() {
		return tv.getCanalAtual();
	}
	
	public int consultaVolume() {
		return tv.getVolumeAtual();
	}
	
	public TV getTelevisao() {
		return tv;
	}

	public void setTelevisao(TV televisao) {
		this.tv = televisao;
	}

}
