package d23_08_2022;

public class ZeleniKarton {
	private String punoImeStudenta;
	private String brIndeksa;
	private String predmet;
	private String punoImeProfa;
	private int ocena;
	public ZeleniKarton(String punoImeStudenta, String brIndeksa, String predmet, String punoImeProfa, int ocena) {
		super();
		this.punoImeStudenta = punoImeStudenta;
		this.brIndeksa = brIndeksa;
		this.predmet = predmet;
		this.punoImeProfa = punoImeProfa;
		this.ocena = ocena;
	}
	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}
	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getPunoImeProfa() {
		return punoImeProfa;
	}
	public void setPunoImeProfa(String punoImeProfa) {
		this.punoImeProfa = punoImeProfa;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	public boolean polozenIspit () {
		return this.ocena > 5;
	}
	
	public void print () {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.punoImeStudenta + ", " + this.brIndeksa);
	}
}
