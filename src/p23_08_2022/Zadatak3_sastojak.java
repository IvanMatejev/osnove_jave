package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3_sastojak {

	public static void main(String[] args) {
//		3.Zadatak
//		Kreirati klasu Sastojak koja ima:
//		naziv sastojka
//		cenu 
//		gettere i settere 
//		konstuktore


//		--U glavnom programu kreirati 3 sastojka.
//			 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. 
//			 Koristeci ArrayList-e
		
		Sastojak secer = new Sastojak("Secer", 80);
		Sastojak mleko = new Sastojak("Mleko", 80);

		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj sastojaka: ");
		int n = s.nextInt();
		ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		for ( int i = 0 ; i < n ; i++ ) {
			System.out.println("Unesite sastojak: ");
			String sastojak = s.next();
			System.out.println("Unesite cenu: ");
			int cena = s.nextInt();
			Sastojak sastojak1 = new Sastojak(sastojak, cena);
			sastojci.add(sastojak1);
			
		}
		int suma = 0;
		for ( int i = 0; i < sastojci.size() ; i++) {
			System.out.println(sastojci.get(i).getNaziv() + " - " + sastojci.get(i).getCena());
			suma += sastojci.get(i).getCena();
		}
		System.out.println("Cena svih sastojaka je " + suma);

	}

}
