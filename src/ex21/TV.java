package ex21;

public class TV {
	private int volumeAtual, canalAtual, volumeMax, volumeMin;
	
	public TV(int volumeAtual, int canalAtual, int volumeMax, int volumeMin) {
		this.volumeAtual = volumeAtual;
		this.canalAtual = canalAtual;
		this.volumeMax = volumeMax;
		this.volumeMin = 0;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeMax() {
		return volumeMax;
	}

	public void setVolumeMax(int volumeMax) {
		this.volumeMax = volumeMax;
	}

	public int getVolumeMin() {
		return volumeMin;
	}
	
	

}
