package p25_08_2022;

import java.util.ArrayList;

public class Reziser {
	private String punoIme;
	private ArrayList<Film> filmovi = new ArrayList<Film>();
	
	public Reziser ( String punoIme ) {
		this.punoIme = punoIme;
	}
	
	public void dodajFilm ( Film film) {
		this.filmovi.add(film);
	}
	
	public void print () {
		System.out.println("Reziser: " + this.punoIme );
		for ( int i = 0 ; i < this.filmovi.size(); i++ ) {
			this.filmovi.get(i).print();
		}
	}

}
