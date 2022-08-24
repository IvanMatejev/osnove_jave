package p23_08_2022;

public class ViberPoruka {
	private String tekst;
	private String vreme;
	private ViberKorisnik salje;
	private ViberKorisnik prima;
	private ViberReakcija reakcija;
	
	
	public ViberPoruka(String tekst, String vreme, ViberKorisnik salje, ViberKorisnik prima, ViberReakcija reakcija) {
		super();
		this.tekst = tekst;
		this.vreme = vreme;
		this.salje = salje;
		this.prima = prima;
	}
	
	
	public ViberReakcija getReakcija() {
		return reakcija;
	}


	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public ViberKorisnik getSalje() {
		return salje;
	}

	public void setSalje(ViberKorisnik salje) {
		this.salje = salje;
	}

	public ViberKorisnik getPrima() {
		return prima;
	}

	public void setPrima(ViberKorisnik prima) {
		this.prima = prima;
	}
	
	
	
}
