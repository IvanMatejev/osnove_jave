package d22_08_2022;

public class Zadatak1_knjiga {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor autor1 = new Autor("Mesa", "Selimovic");
		Knjiga knjiga1= new Knjiga("585969", 1965, "Tvrdjava", autor1);
		
		Autor autor2 = new Autor("Dzordz", "Orvel");
		Knjiga knjiga2= new Knjiga("994531", 1950, "Zivotinjska farma", autor2);
		
		knjiga1.print();
		System.out.println();
		knjiga2.print();
		
		


	}

}
