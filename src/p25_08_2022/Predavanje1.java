package p25_08_2022;

import java.util.ArrayList;

public class Predavanje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reziser r = new Reziser("Pera Peric");
		
		Film f1 = new Film("Roki 1", 1999);
		Film f2 = new Film("Roki 2", 2001);
		Film f3 = new Film("Roki 3", 2003);
		Film f4 = new Film("Roki 4", 2005);
		
		r.dodajFilm(f1);
		r.dodajFilm(f2);
		r.dodajFilm(f3);
		r.dodajFilm(f4);
		
		r.print();
	}

}
