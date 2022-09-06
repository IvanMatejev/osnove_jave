package d05_09_2022;

public class Zadatak1_radnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
