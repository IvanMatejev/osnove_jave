package p23_08_2022;

public class Sastojak {
	private String naziv;
	private int cena;
	
	public Sastojak(String naziv, int cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getCena() {
		return cena;
	}
	
}
