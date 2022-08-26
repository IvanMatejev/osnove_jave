package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
	ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
	
	public void Pasta () {
		
	}
	
	public void dodajSastojak ( Sastojak sastojak ) {
		this.sastojci.add(sastojak);
	}
	
	public double racunajCenu () {
		double suma = 0;
		for ( int i = 0; i < this.sastojci.size(); i++) {
			suma += this.sastojci.get(i).getCena();
		}
		return suma;
	}
	
	public void print () {
		System.out.println("Pasta je sa sastojcima: ");
		for ( int i = 0; i < this.sastojci.size(); i++) {
			this.sastojci.get(i).print();
		}
		System.out.println("Cena paste je " + this.racunajCenu());
	}
	
	public void obrisiSastojak ( String nazivSastojka ) {
		for ( int i = 0; i < this.sastojci.size(); i++) {
			if ( this.sastojci.get(i).getNaziv().equals( nazivSastojka )) {
				this.sastojci.remove(i); 
			}
		}
	}

}
