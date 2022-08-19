package d18_08_2022;

public class Zadatak1_proizvod {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija
//		nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja
//		atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine
//		se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
		
		Proizvod artikl = new Proizvod();
		artikl.naziv = "kafa";
		artikl.cena = 200;
		artikl.tezinaGrami= 200;
		
		Proizvod artikl2 = new Proizvod();
		artikl2.naziv = "secer";
		artikl2.cena = 80;
		artikl2.tezinaGrami= 600;
		
		artikl.print();
		artikl2.print();
		
		artikl.povecajCenu(20);
		System.out.println(artikl.cena);
		artikl2.povecajCenu(70);
		System.out.println(artikl2.cena);
		
		double cenaPopust1 = artikl.vratiCenuSPopustom (10);
		System.out.println("Cena sa popustom artikla " + artikl.naziv + " je " + cenaPopust1 );
		double cenaPopust2 = artikl2.vratiCenuSPopustom (20);
		System.out.println("Cena sa popustom artikla " + artikl2.naziv + " je " + cenaPopust2 );
		
		System.out.println("Postarina za proizvod " + artikl.naziv + " je " + artikl.racunajPostarinu() + " rsd.");
		System.out.println("Postarina za proizvod " + artikl2.naziv + " je " + artikl2.racunajPostarinu() + " rsd.");
		
		
		


	}

}
