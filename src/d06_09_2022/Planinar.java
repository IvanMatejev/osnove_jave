package d06_09_2022;

public abstract class Planinar {
	protected String jci;
	protected String punoIme;
	
	public Planinar(String jci, String punoIme) {
		this.jci = jci;
		this.punoIme = punoIme;
	}

	public String getJci() {
		return jci;
	}

	public String getPunoIme() {
		return punoIme;
	}
	
	public abstract void print();
	
	public abstract int dajMiClanarinu ();
	
	public abstract boolean uspesanUspon ( Planina planina );
	
	
}
