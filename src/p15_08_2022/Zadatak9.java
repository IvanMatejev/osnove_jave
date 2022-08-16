package p15_08_2022;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9.Zadatak
//		Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int). 
//		1 - I
//		2 - II
//		3 - III
//		4 - IV
//		5 - V
//
//		Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//		Ako se unese V vraca se 5.
		
		int arapskiBroj = rimskiBrojevi("V");
		System.out.println(arapskiBroj);

	}
	
	public static int rimskiBrojevi ( String a ) {
		if ( a.equals("I")) {
			return 1;
		}else if(a.equals("II")){
			return 2;
		}else if(a.equals("III")){
			return 3;
		}else if(a.equals("IV")){
			return 4;
		}else if(a.equals("V")){
			return 5;
		}else {
			return 0;
		}
	}


}
