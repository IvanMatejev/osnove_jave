package d16_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaGrami;
	
	
	public void print() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
	}
	
	public double convert( String mera ) {
		if( mera.equals("kg")) {
			return this.tezinaGrami/1000;
		}else if( mera.equals("t")){
			return this.tezinaGrami/1000000;
		}
		return 0;
	}
}
