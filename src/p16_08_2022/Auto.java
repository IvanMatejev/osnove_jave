package p16_08_2022;

public class Auto {
	public String vozac;
	public String marka;
	public int vrata;
	public int potrosnja;
	public int trenutnaBrzina;
	public int ogranicenje;
	public int godProizvodnje;
	public int registrovanDo;
	public int kubika;
	
	
	public void print () {
		System.out.println(this.vozac);
		System.out.println(this.marka + "-" + this.vrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
		System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
	}
	
	public boolean prekoracenje( int ogranicenje ) {
		return this.trenutnaBrzina > ogranicenje ;
		
	}
	
	public int kazna() {
		if ( this.trenutnaBrzina > this.ogranicenje){
			return (this.trenutnaBrzina - this.ogranicenje)*1000;
		}
		return 0;
	}
	
	public boolean oldtimer() {
		return 1950 > this.godProizvodnje;
	}
	public boolean istek( int trenutniMesec) {
		return trenutniMesec > this.registrovanDo;
	}
	
	public double registracija() {
		if (this.kubika < 2000) {
			return this.kubika * 100;
		}else {
			return this.kubika * 100 + (this.kubika * 100 * 0.33);
		}
	}
	

}
