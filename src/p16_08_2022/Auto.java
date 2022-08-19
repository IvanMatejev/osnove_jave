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
	public String brRegistracije;
	public boolean klima;
	public int maxBrzina;
	public int kapacitetRezervoara;
	public int kolicinaGoriva;
	
	
	
	public int natociGorivo ( int litara ) {
		if( this.kolicinaGoriva + litara <= this.kapacitetRezervoara) {
			return litara * 170;
		}else {
			return this.kapacitetRezervoara - this.kolicinaGoriva;
		}
	}
	
	public void stampajTablu() {
		for( int i = 1 ; i <= 100 ; i++ ) {
			if( i <= (this.trenutnaBrzina*100)/this.maxBrzina) {
				System.out.print("|");
			}else {
				System.out.print(".");
			}
		}
	}
	
	public double potrosnja() {
		if( this.klima == true ) {
			return (this.trenutnaBrzina/100 * this.potrosnja)*1.2;
		}else if( this.klima == false ) {
			return this.trenutnaBrzina/100 * this.potrosnja;
		}else {
			return 0;
		}
		
	}  
	
	public void dodajGas() {
		if ( this.trenutnaBrzina + 10 < this.maxBrzina ) {
			this.trenutnaBrzina += 10;
		}else {
			this.trenutnaBrzina = this.maxBrzina;
		}
	}
	
	public void koci() {
		if( this.trenutnaBrzina - 10 > 0 ) {
			this.trenutnaBrzina -= 10;
		} else {
			this.trenutnaBrzina = 0;
		}
	}
	
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
			return this.kubika * 100 *1.33;
		}
	}
	

}
