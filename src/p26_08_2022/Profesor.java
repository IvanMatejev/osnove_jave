package p26_08_2022;

public class Profesor extends Osoba {
	protected String predmet;
	protected int plata;
	
	public Profesor(String punoIme, String jmbg, String predmet, int plata) {
		super(punoIme, jmbg);
		this.predmet = predmet;
		this.plata = plata;
		// TODO Auto-generated constructor stub
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}
	
	public void povecajPlatu ( int procenatPovecanja) {
		this.plata += this.plata * procenatPovecanja/100;
	}
	
	@Override
	public void stampaj () {
		super.stampaj();
		System.out.println("Plata: " + this.plata);
		System.out.println("Predmet: " + this.predmet);
	}
	
	
}
