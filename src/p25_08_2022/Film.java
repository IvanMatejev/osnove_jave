package p25_08_2022;

public class Film {
	private String naziv;
	private int godina;
	public Film(String naziv, int godina) {
		super();
		this.naziv = naziv;
		this.godina = godina;
	}
	
	public void print () {
		System.out.println(this.naziv + " - " + this.godina);
	}

}
