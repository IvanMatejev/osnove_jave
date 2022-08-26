package p25_08_2022;

public class Reakcija {
	private String tip;
	private String reagovao;
	
	public Reakcija(String tip, String reagovao) {
		this.tip = tip;
		this.reagovao = reagovao;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getReagovao() {
		return reagovao;
	}

	public void setReagovao(String reagovao) {
		this.reagovao = reagovao;
	}

}
