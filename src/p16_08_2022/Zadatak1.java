package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.Zad
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i 
//		ostampati podatke za svaki objekat.
		Racun r = new Racun();
		Racun r2 = new Racun();
		
		r.brRacuna = "840-555-555";
		r.ime = "Ivan";
		r.prezime = "Matejev";
		r.stanje = 856.25;
		
		r2.brRacuna = "840-888-7777";
		r2.ime = "Pera";
		r2.prezime = "Peric";
		r2.stanje = 65.25;
		
		System.out.print("Posiljalac: ");
		System.out.print(" Br. racuna: " + r.brRacuna + ", ");
		System.out.print(" Ime: " + r.ime + ", ");
		System.out.print(" Prezime: " + r.prezime + ", ");
		System.out.print(" Stanje: " + r.stanje + ", ");
		System.out.println();
		
		System.out.print("Primalac: ");
		System.out.print(" Br. racuna: " + r2.brRacuna + ", ");
		System.out.print(" Ime: " + r2.ime + ", ");
		System.out.print(" Prezime: " + r2.prezime + ", ");
		System.out.print(" Stanje: " + r2.stanje + ", ");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite sumu za transakciju:");
		double transakcija = s.nextDouble();
		r.stanje = r.stanje - transakcija;
		r2.stanje = r2.stanje + transakcija;
		
		System.out.println("Stanje neakon transakcije: ");
		System.out.print("Posiljalac: ");
		System.out.print(" Br. racuna: " + r.brRacuna + ", ");
		System.out.print(" Ime: " + r.ime + ", ");
		System.out.print(" Prezime: " + r.prezime + ", ");
		System.out.print(" Stanje: " + r.stanje + ", ");
		System.out.println();
		
		System.out.print("Primalac: ");
		System.out.print(" Br. racuna: " + r2.brRacuna + ", ");
		System.out.print(" Ime: " + r2.ime + ", ");
		System.out.print(" Prezime: " + r2.prezime + ", ");
		System.out.print(" Stanje: " + r2.stanje + ", ");
		System.out.println();
		
		
		
	}

}
