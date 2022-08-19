package d18_08_2022;

public class Proizvod {
	public String naziv;
	public int cena;
	public double tezinaGrami;
	
	
	public void print () {
		System.out.println( this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
	}
	
	public void povecajCenu ( int x ) {
		this.cena += x ;
	}
	
	public double vratiCenuSPopustom ( int popust ) {
		return this.cena - (this.cena * popust / 100) ;
	}
	
	public int racunajPostarinu () {
		if ( this.tezinaGrami <= 100 ) {
			return 200;
		}else if ( this.tezinaGrami  <= 500 ) {
			return 400;
		}
		return 1000;
	}

}
