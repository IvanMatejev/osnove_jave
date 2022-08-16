package d16_08_2022;

public class Zadatak1Proizvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
		Proizvod product1 = new Proizvod();
		product1.naziv = "Secer";
		product1.cena = 60.5;
		product1.tezinaGrami = 1000;
		
		Proizvod product2 = new Proizvod();
		product2.naziv = "Brasno";
		product2.cena = 100.5;
		product2.tezinaGrami = 1500;
		
		product1.print();
		product2.print();
		
		System.out.print("Tezina proizvoda " + product1.naziv + " u tonama je : " + product1.convert("t"));
		System.out.println();
		System.out.print("Tezina proizvoda " + product2.naziv + " u kilogramima je : " + product2.convert("kg"));
		
		


	}

}
