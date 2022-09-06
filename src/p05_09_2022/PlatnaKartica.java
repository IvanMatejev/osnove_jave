package p05_09_2022;

public abstract class PlatnaKartica {
	protected double suma;
	protected String broj;
	protected int godinaDo;
	protected int mesecDo;
	
	public PlatnaKartica(double suma, String broj, int godinaDo, int mesecDo) {

		this.suma = suma;
		this.broj = broj;
		this.godinaDo = godinaDo;
		this.mesecDo = mesecDo;
	}

	public double getSuma() {
		return suma;
	}

	public String getBroj() {
		return broj;
	}

	public int getGodinaDo() {
		return godinaDo;
	}

	public int getMesecDo() {
		return mesecDo;
	}
	
	public void dodajSredstva ( int suma ) {
		this.suma += suma;
	}
	
	public abstract void izvrsiTranskciju ( int suma );
	
	public abstract  void print ();
	
	
}
