package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {
	private String grad;
	private ArrayList<Objekat> objekti = new ArrayList<Objekat>();
	
	
	
	public PoreskaUprava() {
	}

	public PoreskaUprava(String grad) {
		super();
		this.grad = grad;
	}

	public void dodajObjekat ( Objekat objekat) {
		objekti.add(objekat);
	}
	
	public Objekat najveciPorez () {
		Objekat najveciPorez = this.objekti.get(0);
		
		for ( int i = 0; i<this.objekti.size(); i++) {
			if ( this.objekti.get(i).porez() > najveciPorez.porez() ) {
				najveciPorez = this.objekti.get(i);
			}
		}
		return najveciPorez;
	}
	
	public Objekat najmanjiPorez () {
		Objekat najmanjiPorez = this.objekti.get(0);
		
		for ( int i = 0; i<this.objekti.size(); i++) {
			if ( this.objekti.get(i).porez() < najmanjiPorez.porez() ) {
				najmanjiPorez = this.objekti.get(i);
			}
		}
		return najmanjiPorez;
	}
	
	public void print () {
		for ( int i = 0; i < this.objekti.size(); i++ ) {
			this.objekti.get(i).print();
			System.out.println(this.objekti.get(i).porez());
			System.out.println();
		}
	}
	
	public double ukupanPorez () {
		double ukupno = 0;
		for ( int i = 0; i < this.objekti.size(); i++ ) {
			ukupno += this.objekti.get(i).porez();
		}
		return ukupno;
	}
	
	
}
