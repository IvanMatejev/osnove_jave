package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak
//		Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu 
//		vrednost   prosledjene vrednosti.
		apsolutnaVrednost(-1);
		apsolutnaVrednost(5);
		apsolutnaVrednost(-5);

	}
	
	public static void apsolutnaVrednost( int x ) {
		if ( x < 0 ) {
			x *= -1;
		}
		System.out.println("Apsolutna vrednost je " + x);
	}

}
