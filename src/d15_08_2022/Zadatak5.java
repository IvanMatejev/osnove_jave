package d15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.
		printChar(4, '&');
		printChar(8, '/');

	}
	
	public static void printChar ( int n, char simbol ) {
		for ( int i = 0 ; i < n ; i++ ) {
			System.out.print(simbol + " ");
		}
		System.out.println();
	}

}
