package d06_09_2022;

public class SuperaKartica {
	private int broj;
	private String vlasnik;
	private int popust;
	
	public SuperaKartica() {
	}

	public SuperaKartica(int broj, String vlasnik, int popust) {
		super();
		this.broj = broj;
		this.vlasnik = vlasnik;
		this.popust = popust;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void stampajKarticu () {
		System.out.println("Broj kratice: " + this.broj + "Vlasnik: " + this.vlasnik);
	}
	
	
	
	
}
