package d16_08_2022;

public class Zadatak2SmartAirConditioning {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//			Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
		
		SmaratAirConditioning klima1 = new SmaratAirConditioning();
		klima1.mark = "Samsung";
		klima1.temp = 22.5 ;
		klima1.mode = "greje";
		
		SmaratAirConditioning klima2 = new SmaratAirConditioning();
		klima2.mark = "Gree";
		klima2.temp = 17.5 ;
		klima2.mode = "hladi";
		
		klima1.print();
		klima2.print();
		
		boolean x = klima1.razlika(20);
		System.out.println("Temperatura u kuci je " + klima1.temp);
		if ( x == true) {
			System.out.println("Napolju je manja temperatura");
		}else {
			System.out.println("Napolju je veca temperatura");
		}
		
		boolean y = klima2.razlika(20);
		System.out.println("Temperatura u kuci je " + klima2.temp);
		if ( y == true) {
			System.out.println("Napolju je manja temperatura");
		}else {
			System.out.println("Napolju je veca temperatura");
		}

	}

}
