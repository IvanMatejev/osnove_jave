package d23_08_2022;

public class Racun {
	private String broj;
	private String vlasnik;
	private int stanje;
	
	public Racun() {
	}

	public Racun(String broj, String vlasnik, int stanje) {
		super();
		this.broj = broj;
		this.vlasnik = vlasnik;
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public int getStanje() {
		return stanje;
	}
	
	public void promenaStanja( double odliv ) {
		if ( this.stanje - odliv >= 0 ) {
			this.stanje -= odliv;
		}
	}
	
	public void print () {
		System.out.println(this.vlasnik + " - " + this.broj );
		System.out.println("Stanje na racunu je " + this.stanje + "rsd.");
	}
	
	
	
}
