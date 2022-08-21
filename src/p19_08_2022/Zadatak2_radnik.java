package p19_08_2022;

public class Zadatak2_radnik {

	public static void main(String[] args) {
//		2.Zad Kreirati klasu Radnik koja ima:
//			jmbg radnika
//			ime i prezime
//			broj dece (1,2,3,... ili 0 ako nema dece)
//			stepen strucne spreme (od 1 do 8)
//			godine radnog staza
//			konstuktor koji postavlja samo jmbg
//			konstuktor koji postavlja sve atribute
//			getere i setere
//			metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//			metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//			metodu koja racuna platu radnika, plata se racuna po formuli:
//			25000 + (koeficijent slozenosti + minuli rad) * 10000
//			metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//
//
//			Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//			- do 10 godina 0.05
//			- od 10-20 godina 0.075
//			- preko 20 godina 0.1
		Radnik radnik1 = new Radnik("123456789", "Ivan Matejev", 3, 3, 10);
		Radnik radnik2 = new Radnik("987654321");
		
		radnik2.setBrDece(1);
		radnik2.setImePrezime("Pera Peric");
		radnik2.setRadniStaz(30);
		radnik2.setSs(7);
		
		System.out.println("Radnik1: " + radnik1.getImePrezime() + ", radni staz: " + radnik1.getRadniStaz() + ", strucna sprema: " + radnik1.getSs()
							+ "br dece: " + radnik1.getBrDece());
		System.out.println();
		System.out.println("Radnik2: " + radnik2.getImePrezime() + ", radni staz: " + radnik2.getRadniStaz() + ", strucna sprema: " + radnik2.getSs()
							+ ", br dece: " + radnik2.getBrDece());
		System.out.println(" Plata radnika " + radnik1.getImePrezime() + " je " + radnik1.plataRadnika());
		System.out.println(" Plata radnika " + radnik2.getImePrezime() + " je " + radnik2.plataRadnika());
		
		if( radnik1.kreditnoSposoban() == true ) {
			System.out.println(radnik1.getImePrezime());
			System.out.println("Radnik je kreditno sposoban.");
		}else {
			System.out.println(radnik1.getImePrezime());
			System.out.println("Radnik nije kreditno sposoban.");
		}
		System.out.println();
		if( radnik2.kreditnoSposoban() == true ) {
			System.out.println(radnik2.getImePrezime());
			System.out.println("Radnik je kreditno sposoban.");
		}else {
			System.out.println(radnik2.getImePrezime());
			System.out.println("Radnik nije kreditno sposoban.");
		}


	}

}
