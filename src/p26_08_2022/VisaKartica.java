package p26_08_2022;

public class VisaKartica extends PlatnaKartica {
	private String ovlascenoLice;
	
	public VisaKartica(int suma, String broj, int godina, int mesec, String ovlascenoLice) {
		super(suma, broj, godina, mesec);
		this.ovlascenoLice = ovlascenoLice;
		// TODO Auto-generated constructor stub
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}
	
	private double racunajProviziju ( double iznos) {
		double provizija = iznos * 0.018;
		return provizija < 4 ? 4 : provizija;
	}
	@Override
	public void izvrsiTransakciju ( double iznos) {
		this.suma = this.suma - iznos - this.racunajProviziju(iznos);
	}
	@Override
	public void print () {
		System.out.print("Visa Card: ");
		super.print();
	}

}
