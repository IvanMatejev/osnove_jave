package p23_08_2022;

public class FizickoLice {
	private String imePrezime;
	private String brLicneKarte;
	private String jmbg;
	private boolean kupovala;
	public FizickoLice(String imePrezime, String brLicneKarte, String jmbg, boolean kupovala) {
		super();
		this.imePrezime = imePrezime;
		this.brLicneKarte = brLicneKarte;
		this.jmbg = jmbg;
		this.kupovala = kupovala;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getBrLicneKarte() {
		return brLicneKarte;
	}
	public void setBrLicneKarte(String brLicneKarte) {
		this.brLicneKarte = brLicneKarte;
	}
	public boolean isKupovala() {
		return kupovala;
	}
	public void setKupovala(boolean kupovala) {
		this.kupovala = kupovala;
	}
	public String getJmbg() {
		return jmbg;
	}
	
	public void print () {
		System.out.println(this.imePrezime + ", " + this.brLicneKarte);
	}
}
