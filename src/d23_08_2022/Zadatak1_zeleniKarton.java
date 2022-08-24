package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1_zeleniKarton {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		ZeleniKarton ispit1 = new ZeleniKarton("Ivan Matejev", "007", "predmet1", "Pera Peric", 5);
		ZeleniKarton ispit2 = new ZeleniKarton("Ivan Matejev", "007", "predmet2", "Pera Peric", 8);
		ZeleniKarton ispit3 = new ZeleniKarton("Ivan Matejev", "007", "predmet3", "Pera Peric", 5);
		ZeleniKarton ispit4 = new ZeleniKarton("Ivan Matejev", "007", "predmet4", "Pera Peric", 10);
		ZeleniKarton ispit5 = new ZeleniKarton("Ivan Matejev", "007", "predmet5", "Pera Peric", 7);
		ZeleniKarton ispit6 = new ZeleniKarton("Ivan Matejev", "007", "predmet6", "Pera Peric", 6);
		ispiti.add(ispit1);
		ispiti.add(ispit2);
		ispiti.add(ispit3);
		ispiti.add(ispit4);
		ispiti.add(ispit5);
		ispiti.add(ispit6);
		
		int count = 0;
		double prosek=0;
		for ( int i = 0 ; i < ispiti.size() ; i ++ ) {
			ispiti.get(i).print();
			prosek += ispiti.get(i).getOcena();
			if (ispiti.get(i).polozenIspit() == true) {
				count++;
			}
		}
		System.out.println("Broj polozenih ispita je " + count + ".");
		System.out.println("Proecna ocena je " + prosek/ispiti.size());
//		System.out.println(ispiti.get(0).getPunoImeProfa());
	}

}
