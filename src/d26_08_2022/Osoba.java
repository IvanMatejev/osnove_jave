package d26_08_2022;

public class Osoba {
	protected String punoIme;
	protected String jmbg;
	protected int godinaRodj;
	
	public Osoba() {
	}

	public Osoba(String punoIme, String jmbg, int godinaRodj) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godinaRodj = godinaRodj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodj() {
		return godinaRodj;
	}

	public void setGodinaRodj(int godinaRodj) {
		this.godinaRodj = godinaRodj;
	}
	
	public void print () {
		System.out.print(this.punoIme + ", ");
		System.out.print(this.jmbg + ", ");
		System.out.println(this.godinaRodj);
	}
	
	
}
