package test_18_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak (While petlja)
//		Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi lozinku a zatim program od korisnika zahteva
//		unos kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke. 
//		Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//		Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//		Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja lozinke je blokirana”
//		Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena” 
//		Primer izvrsenja 1:
//		Unesite lozinku: sifra123
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: sifra123
//		Lozinka je uspesno postavljena
//
//
//		Primer izvrsenja 2:
//		Unesite lozinku: sifra123
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Lozinke se ne poklapaju
//		Potvrdite lozinku: pogresna
//		Mogucnost postavljanja lozinke je blokirana
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite lozinku: ");
		String lozinka = s.next();
		System.out.println("Ponovite lozinku: ");
		String ponovljenaLozinka = s.next();
		
		int count = 0;
		boolean isEnd = false;
		while ( isEnd == false ) {
			if ( lozinka.equals(ponovljenaLozinka)) {
				System.out.println("Lozinka je uspesno postavljena.");
				isEnd = true;
			}else {
				count++;
				if ( count > 2 ) {
					System.out.println("Mogucnost postavljanja lozinke je blokirana.");
					isEnd = true;
				}else {
					System.out.println("Lozinke se ne poklapaju. Pokusajte ponovo: ");
					ponovljenaLozinka = s.next();
				}
			}
		}
		


	}

}
