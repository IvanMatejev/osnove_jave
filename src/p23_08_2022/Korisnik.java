package p23_08_2022;

public class Korisnik {
	private String imePrezime;
	private String tipLicence;
	public Korisnik() {
		this.tipLicence = "basic";
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public void pretplatiSe ( int pretplata ) {
		if( pretplata == 100) {
			this.tipLicence = "pro";
		}
		if( pretplata == 150 ) {
			this.tipLicence = "premium";
		}
	}
	
	public void ponistiPretplatu () {
		this.tipLicence = "basic";
	}
	
	public int maxDuzinaPoziva () {
		if ( this.tipLicence == "basic") {
			return 40;
		}else if ( this.tipLicence == "pro") {
			return 240;
		}
		return 1440;
		
	}
	
	public void print () {
		System.out.println(this.imePrezime);
	}
		
}
