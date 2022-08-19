package test_18_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak (Metode)
//		Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. Metoda kao parametre prima vrednost 
//		u metrima i jedinicu u kojoj treba izvrsiti konverziju a vraca konvertovanu vrednost.
//
//		Podsetnik za konverziju jedinica:
//		1m = 100 cm
//		1m = 10 dm
//		1m = 0.001 km
//
//		Primer poziva metode
//		Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//		Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//		U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//		Primer izvrsenja programa:
//		3.5m je 350cm
//		3.5m je 35dm
//		3.5m je 0.0035km
		double x = 30.5;
		System.out.println(x + " m je " + konvertor( x, "cm") + " cm.");
		System.out.println(x + " m je " + konvertor( x, "dm") + " dm.");
		System.out.println(x + " m je " + konvertor( x, "km") + " km.");


	}
	 public static double konvertor ( double m , String mera) {
		 if( mera.equals("cm")) {
			 return m * 100;
		 }else if( mera.equals("dm")) {
			 return m * 10;
		 }else if( mera.equals("km")) {
			 return m / 1000;
		 }else {
			 return 0;
		 }
	 }

}
