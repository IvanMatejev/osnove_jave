package p06_09_2022;

public class Zadatak1_objekat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoreskaUprava uprava = new PoreskaUprava();
		
		uprava.dodajObjekat(new Zgrada("KK 15", 100, 2, 10));
		uprava.dodajObjekat(new Kuca("PP 5", 200, 1, 4));
		uprava.dodajObjekat(new Lokal("EE 88", 50, 3));
		
//		for ( int i = 0; i < uprava.objekti.size(); i++) {
//			uprava.objekti.get(i).print();
//			System.out.println();
//		}
		
		uprava.print();
		
		System.out.println("Najveci porez:");
		uprava.najveciPorez().print();
		System.out.println();
		System.out.println("Najmanji porez: ");
		uprava.najmanjiPorez().print();
		System.out.println();
		System.out.println("Ukupan porez za ceo grad je: " + uprava.ukupanPorez());
		
	}

}
