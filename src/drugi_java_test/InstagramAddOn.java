package drugi_java_test;

public abstract class InstagramAddOn {
	protected int id;
	protected int x;
	protected int y;
	protected int sirinaDodatka;
	protected int visinaDodatka;
	
	public InstagramAddOn(int id, int x, int y, int sirinaDodatka, int visinaDodatka) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.sirinaDodatka = sirinaDodatka;
		this.visinaDodatka = visinaDodatka;
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSirinaDodatka() {
		return sirinaDodatka;
	}

	public int getVisinaDodatka() {
		return visinaDodatka;
	}
	
	public abstract int minSirinaDodatka ();
	
	public abstract int minVisinaDodatka ();
	
	public void povecajDodatke ( int sirina, int visina ) {
		this.sirinaDodatka += sirina;
		this.visinaDodatka += visina;
	}
	
	public void smanjiDodatke ( int sirina, int visina ) {
		if ( this.sirinaDodatka - sirina >= this.minSirinaDodatka()) {
			this.sirinaDodatka -= sirina;
		}
		if ( this.visinaDodatka - visina >= this.minVisinaDodatka()) {
			this.visinaDodatka -= visina;
		}
	}
	
	public abstract void print ( InstagramUser user);
	
	
}
