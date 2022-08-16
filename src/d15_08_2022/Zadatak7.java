package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {

//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		int newMin = returnMin(9, 8 , 10);
		System.out.println("Najveca vrednost je " + newMin);

	}

	public static int returnMin ( int a , int b , int c ) {
		int min = a;
		if ( min > b ) {
			min = b;
		}
		if ( min > c ) {
			min = c;
		}
		return min;
	}
}
