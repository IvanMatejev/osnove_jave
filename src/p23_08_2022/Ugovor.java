package p23_08_2022;

public class Ugovor {
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;
	
	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
		super();
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}

	public String getDatum() {
		return datum;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public int getCena() {
		return cena;
	}

	public String getAdresa() {
		return adresa;
	}
	
	public double procenat () {
		if (this.kupac.isKupovala() == true ) {
			return 0.02;
		}else {
			return 0.03;
		}
	}
	
	public double zaradaAgencije () {
		return 1000 + this.cena * this.procenat();
	}
	
	public void print () {
		System.out.println("Dana " + this.datum + " godine je skloplje ugovor"
				+ " izmedju " + this.prodavac.getImePrezime() + " i " + this.kupac.getImePrezime() + 
				"o kupovini nekretnine " + this.adresa + " po ceni " +this.cena + 
				" pri cemu je kupac duzan da isplati agenciji vrednost u iznosu od " + 
				this.zaradaAgencije());
	}
	
	
}
