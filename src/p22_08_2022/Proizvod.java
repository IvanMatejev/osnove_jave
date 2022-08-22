package p22_08_2022;

public class Proizvod {
	private String naziv;
	private int cenaIzrade;
	private Kupac kupac;
	public Proizvod(String naziv, int cena, Kupac kupac) {
		super();
		this.naziv = naziv;
		this.cenaIzrade = cena;
		this.kupac = kupac;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCenaIzrade() {
		return cenaIzrade;
	}
	public void setCena(int cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	
	public double cenaProizvoda () {
		return this.cenaIzrade * 1.9  * (100 - this.kupac.getClanskaKarta().getPopust())/100;
	}
	
	public void print () {
		System.out.println(this.naziv + " - " + this.cenaProizvoda());
		this.kupac.print();
	}
	
	
}
