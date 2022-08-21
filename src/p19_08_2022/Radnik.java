package p19_08_2022;

public class Radnik {
	private String jmbg;
	private String imePrezime;
	private int brDece;
	private int sss;
	private int radniStaz;
	
	public Radnik ( String jmbg) {
		this.jmbg = jmbg;
	}
	public Radnik ( String jmbg, String imePrezime, int brDece, int sss, int radniStaz ) {
		this.jmbg = jmbg;
		this.imePrezime = imePrezime;
		this.brDece = brDece ;
		this.sss = sss ; 
		this.radniStaz = radniStaz;
	}
	public String getImePrezime () {
		return this.imePrezime;
	}
	public void setImePrezime ( String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public int getBrDece () {
		return this.brDece;
	}
	public void setBrDece ( int brDece ) {
		this.brDece = brDece;
	}
	public int getSss () {
		return this.sss;
	}
	public void setSss ( int sss ) {
		this.sss = sss;
	}
	public int getRadniStaz () {
		return this.radniStaz;
	}
	public void setRadniStaz ( int radniStaz ) {
		this.radniStaz = radniStaz;
	}
	public double minuliRad () {
		if(this.radniStaz < 10) {
			return 0.05;
		}else if( this.radniStaz < 20 ) {
			return 0.075;
		}
		return 0.1;
	}
	public double koeficijentSlozenosti () {
		return 2.0;
	}
	public double plataRadnika () {
		return 25000+(this.koeficijentSlozenosti() + this.minuliRad())*1000;
	}
	public boolean kreditnoSposoban () {
		return this.plataRadnika() > 50000;
	}

}
