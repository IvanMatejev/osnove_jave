package p05_09_2022;

public abstract class Student {
	protected String punoIme;
	protected String brIndeksa;
	protected int godinaStudija;
	
	
	public Student(String punoIme, String brIndeksa, int godinaStudija) {
		super();
		this.punoIme = punoIme;
		this.brIndeksa = brIndeksa;
		this.godinaStudija = godinaStudija;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public int getGodinaStudija() {
		return godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	public abstract int cenaSkolarine();
	
	public abstract boolean daLiJeNaBudzetu();
	
	public void print () {
		System.out.println(this.punoIme + ", " + this.brIndeksa + ", " + this.godinaStudija);
		if ( this.daLiJeNaBudzetu() == true) {
			System.out.println("Finansiranje: Budzet.");
		}else {
			System.out.println("Finansiranje: Samofinansiranje.");
		}
		System.out.println("Cena: " + this.cenaSkolarine());
	}
}
