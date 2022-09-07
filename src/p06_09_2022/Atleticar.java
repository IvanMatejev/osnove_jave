package p06_09_2022;

public abstract class Atleticar {
	private String punoIme;
	protected int rezultat;
	public Atleticar(String punoIme, int rezultat) {
		super();
		this.punoIme = punoIme;
		this.rezultat = rezultat;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public int getRezultat() {
		return rezultat;
	}
	public void setRezultat(int rezultat) {
		this.rezultat = rezultat;
	}
	
	public abstract boolean uporediRezultat (Atleticar drugi);
	
	public void print () {
		System.out.println(this.punoIme);
		System.out.println(this.rezultat);
	}
	
	
	
}
