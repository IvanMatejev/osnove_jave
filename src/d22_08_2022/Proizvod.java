package d22_08_2022;

public class Proizvod {
	private int sifra;
	private String naziv;
	private double cenaKg;
	
	public Proizvod(int sifra, String naziv, double cenaKg) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaKg = cenaKg;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setCenaKg(double cenaKg) {
		this.cenaKg = cenaKg;
	}
	
	public double getCenaKg () {
		return this.cenaKg;
	}
	
	public double getCenaLb () {
		return this.cenaKg / 2.2046;
	}
	
	public void print () {
		System.out.println(this.sifra + " - " + this.naziv);
	}
	
	
}
