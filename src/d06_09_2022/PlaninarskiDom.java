package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String naziv;
	private int osnovan;
	private ArrayList<Planinar> clanovi = new ArrayList<Planinar>();
	
	public PlaninarskiDom() {
	}

	public PlaninarskiDom(String naziv, int osnovan) {
		this.naziv = naziv;
		this.osnovan = osnovan;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getOsnovan() {
		return osnovan;
	}

	public ArrayList<Planinar> getClanovi() {
		return clanovi;
	}
	
	public void uclaniPlaninara ( Planinar planinar) {
		clanovi.add(planinar);
	}
	
	public int brojPopelihPlaninara ( Planina planina ) {
		int suma = 0;
		for ( int i = 0; i < this.clanovi.size(); i++ ) {
			if ( this.clanovi.get(i).uspesanUspon(planina) == true ) {
				suma++;
			}
		}
		return suma;
	}
	
	public void izbaciPlaninara ( String jci ) {
		for ( int i = 0; i < this.clanovi.size(); i++ ) {
			if ( this.clanovi.get(i).jci.equals(jci)) {
				this.clanovi.remove(i);
			}
		}
	}
	
	public void print () {
		System.out.println("Planinarski dom: " + this.naziv + "- Osnovan: " + this.osnovan);
		System.out.println("Clanovi doma: ");
		System.out.println();
		for ( int i = 0; i < this.clanovi.size(); i++ ) {
			this.clanovi.get(i).print();
			System.out.println();
		}
	}
	
	public int mesecniPrihodDoma () {
		int suma = 0;
		for ( int i = 0; i < this.clanovi.size(); i++ ) {
			suma += this.clanovi.get(i).dajMiClanarinu();
		}
		return suma;
	}
	
	
}
