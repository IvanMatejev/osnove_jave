package p23_08_2022;

public class ViberKorisnik {
	private String imePrezime;
	private String telefon;
	private boolean aktivan;
	
	public ViberKorisnik(String imePrezime, String telefon, boolean aktivan) {
		super();
		this.imePrezime = imePrezime;
		this.telefon = telefon;
		this.aktivan = aktivan;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public boolean isAktivan() {
		return aktivan;
	}

	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	
	
	
	
}
