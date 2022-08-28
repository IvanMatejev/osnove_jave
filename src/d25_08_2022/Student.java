package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private String brIndeksa;
	private String punoIme;
	private String tipStudija;
	ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student(String brIndeksa, String punoIme, String tipStudija) {
		super();
		this.brIndeksa = brIndeksa;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
	public void dodajIspit ( Ispit ispit ) {
		this.ispiti.add ( ispit );
	}
	
	public double prosek () {
		int suma = 0;
		int brojPolozenih = 0;;
		for ( int i = 0; i < this.ispiti.size() ; i++) {
			if ( this.ispiti.get(i).daLiJePolozen() == true ) {
				suma += this.ispiti.get(i).getOcena();
				brojPolozenih++;
			}
		}
		return suma/brojPolozenih;
	}
	
	public void print () {
		System.out.println("Predmeti:");
		for ( int i = 0; i < this.ispiti.size() ; i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosek je: " + this.prosek());
	}
	
	
}
