package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = suprotno(-5);
		System.out.println(x);
	}
	public static int suprotno ( int n ) {
//		Napisati metodu koja vraca suprotno negativni broj od 
//		prosledjenog. Metoda prima broj N i vraca ga sa negativnom
//		vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//			Ako se metoda pozove za N=-11, vraca 11
		return n * (-1);

	}

}
