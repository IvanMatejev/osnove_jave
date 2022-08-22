package p22_08_2022;

public class Film {
	private String naziv;
	private int godina;
	private  Reziser reziser;
	
	
	public Reziser getReziser() {
		return reziser;
	}

	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}

	public Film ( String naziv, int godina ) {
		this.naziv = naziv;
		this.godina = godina;
	}
	
	public void setNaziv ( String naziv) {
		this.naziv = naziv;
	}
	
	public String getNaziv () {
		return this.naziv;
	}
	
	public void setGodina ( int godina) {
		this.godina = godina;
	}
	
	public int getGodina () {
		return this.godina;
	}
	
	
	
	public void print () {
		System.out.println(this.naziv + ", " + this.godina);
		this.reziser.print();
	}
	

}
