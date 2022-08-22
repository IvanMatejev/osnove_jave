package p22_08_2022;

public class Kupac {
	private String imePrezime;
	private ClanskaKarta clanskaKarta;
	public Kupac(String imePrezime, ClanskaKarta clanskaKarta) {
		super();
		this.imePrezime = imePrezime;
		this.clanskaKarta = clanskaKarta;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	public void setClanskaKarta(ClanskaKarta clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}
	
	public void print () {
		System.out.println(this.imePrezime + " - " + this.clanskaKarta.getBroj());
	}
	
}
