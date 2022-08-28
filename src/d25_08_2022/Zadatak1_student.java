package d25_08_2022;

public class Zadatak1_student {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Student s1 = new Student("007", "Pera Peric", "osnovne");
		
		Ispit ispit1 = new Ispit("matematika", 5, "Mile Milic");
		Ispit ispit2 = new Ispit("hemija", 10, "Peki Pekic");
		Ispit ispit3 = new Ispit("informatika", 5, "Beki Bekic");
		Ispit ispit4 = new Ispit("fizika", 8, "Keba Kebic");
		
		s1.dodajIspit(ispit1);
		s1.dodajIspit(ispit2);
		s1.dodajIspit(ispit3);
		s1.dodajIspit(ispit4);
		
		s1.print();

	}

}
