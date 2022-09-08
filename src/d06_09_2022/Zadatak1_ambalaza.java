package d06_09_2022;

public class Zadatak1_ambalaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korpa korpica = new Korpa();
		SuperaKartica kartica = new SuperaKartica(100, "Pera Peric", 200);
		
		korpica.dodajAmbalazu(new Tetrapak("123456", "Mleko", 900, 1000, true, 150));
		korpica.dodajAmbalazu(new Tetrapak("654321", "Jogurt", 400, 500, false, 100));
		
		korpica.dodajAmbalazu(new StaklenaAmbalaza("555555", "Sok", 90, 100, 30, true, 90));
		
		System.out.println("Sadrzaj korpe: ");
		for ( int i = 0; i< korpica.getAmbalaze().size(); i++ ) {
			korpica.getAmbalaze().get(i).print();
			System.out.println();
		}
		System.out.println("Ukupna cena korpe je: " + korpica.ukupnaCenaKorpe(kartica));
		
		korpica.izbaciAmbalazu("123456");
		System.out.println();
		System.out.println("Novi sadrzaj korpe: ");
		for ( int i = 0; i< korpica.getAmbalaze().size(); i++ ) {
			korpica.getAmbalaze().get(i).print();
			System.out.println();
		}
		
		
		

	}

}
