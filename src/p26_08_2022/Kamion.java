package p26_08_2022;

public class Kamion extends Vozilo {
	private int nosivost;
	
	public Kamion () {
		super();
//		System.out.println("Stampa u kamionu!");
	}
	
	public Kamion ( String registracija, String marka, int brzina, int kubikaza, int maxBrzina ) {
		super(registracija, marka, brzina, kubikaza, maxBrzina);
	}
	
	public void stampaj () {
		this.print();
		System.out.println("Nosivost:" + this.nosivost);
	}
	
}
