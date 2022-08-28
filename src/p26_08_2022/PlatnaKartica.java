package p26_08_2022;

public class PlatnaKartica {
	protected double suma;
	protected String broj;
	protected int godina;
	protected int mesec;
	
	public PlatnaKartica(int suma, String broj, int godina, int mesec) {
		this.suma = suma;
		this.broj = broj;
		this.godina = godina;
		this.mesec = mesec;
	}

	public double getSuma() {
		return suma;
	}

	public String getBroj() {
		return broj;
	}

	public int getGodina() {
		return godina;
	}

	public int getMesec() {
		return mesec;
	}
	
	public void dodajSredstva ( int uplata ) {
		this.suma += uplata;
	}
	
	public void izvrsiTransakciju ( double isplata ) {
		if(this.suma - isplata >= 0 ) {
			this.suma -= isplata;
		}
	}
	
	public void print () {
		System.out.print(this.broj + ", ");
		System.out.print(this.mesec + " / " + this.godina + ", ");
		System.out.println("$" + this.suma);
	}
	
}
