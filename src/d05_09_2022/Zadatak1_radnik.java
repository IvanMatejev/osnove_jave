package d05_09_2022;

public class Zadatak1_radnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

		Menadzer pera = new Menadzer("Pera Peric");
		Magacioner ivan = new Magacioner("Ivan Matejev");
		
		Sektor prodaja = new Sektor("prodaja", 100000);
		Sektor nabavka = new Sektor("nabavka", 120000);
		Sektor marketing = new Sektor("marketing", 200000);
		
		pera.zaposliUSektor(prodaja);
		pera.zaposliUSektor(nabavka);
		pera.zaposliUSektor(marketing);
		
		ivan.zaposliUSektor(prodaja);
		ivan.zaposliUSektor(nabavka);
		
		System.out.println("Radnik:" + pera.punoIme);
		System.out.print("Sektori u kojima radi: ");
		for( int i = 0; i < pera.sektori.size(); i++ ) {
			System.out.print(pera.sektori.get(i).getNaziv() + ", ");
		}
		
		System.out.println("Plata: " + pera.plata());
		System.out.println();
		System.out.println("Radnik:" + ivan.punoIme);
		System.out.print("Sektori u kojima radi: ");
		for( int i = 0; i < ivan.sektori.size(); i++ ) {
			System.out.print(ivan.sektori.get(i).getNaziv() + ", ");
		}
		
		System.out.println("Plata: " + ivan.plata());
		
		
	}

}
