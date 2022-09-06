package p05_09_2022;

import p26_08_2022.VisaKartica;

public class Zadatak2_platnaKartica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visa kartica1 = new Visa(1000, "555-666", 2022, 9, "Pera Peric");
		Master kartica2 = new Master(2000, "999-888", 2025, 10); 
		
		kartica1.dodajSredstva(500);
		kartica2.dodajSredstva(500);
		kartica1.izvrsiTranskciju(300);
		kartica2.izvrsiTranskciju(200);
		kartica2.naplatiOdrzavanje();
		
		kartica1.print();
		System.out.println();
		kartica2.print();
	}

}
