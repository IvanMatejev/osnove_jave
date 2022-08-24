package d23_08_2022;

public class Transakcija {
	private int id;
	private Racun salje;
	private Racun prima;
	
	public Transakcija() {
	}

	public Transakcija(int id, Racun salje, Racun prima) {
		super();
		this.id = id;
		this.salje = salje;
		this.prima = prima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getSalje() {
		return salje;
	}

	public void setSalje(Racun salje) {
		this.salje = salje;
	}

	public Racun getPrima() {
		return prima;
	}

	public void setPrima(Racun prima) {
		this.prima = prima;
	}
	
	private double provizija () {
		return 45;
	}
	
	public void izvrsiTransakciju ( int visinaTransakcije) {
		if( this.salje.getStanje() - visinaTransakcije >= 0 ) {
			this.salje.promenaStanja(visinaTransakcije+this.provizija());
			this.prima.promenaStanja(-visinaTransakcije);
		}else {
			System.out.println("Nemate sredstva za ovu transakciju!");
		}
	}
	
	public void print () {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.salje.getVlasnik() + " - " + this.salje.getBroj());
		System.out.println("Racun na: " + this.prima.getVlasnik() + " - " + this.prima.getBroj());
	}
	
	
}
