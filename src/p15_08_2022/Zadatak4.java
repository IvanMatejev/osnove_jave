package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//		za dva prosledjena broja. Brojevi su ulazni parametri funkcije. 
//		U gravnom programu pozvati nekoliko puta funkciju sa razlicitim 
//		prosledjenim vrednostima. 
		operacije(4, 5);

	}
	
	public static void operacije( int x, int y) {
		int zbir = x + y;
		int razlika = x - y;
		int proizvod = x * y;
		int kolicnik = x / y;
		System.out.println( "x + y = " + zbir);
		System.out.println( "x - y = " + razlika);
		System.out.println( "x * y = " + proizvod);
		System.out.println( "x / y = " + kolicnik);
	}

}
