package d18_08_2022;

public class Zadatak3_SmartAirConditioning {

	public static void main(String[] args) {
//		3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
		
		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.marka = "Samsung";
		klima1.potrosnjaHladi = "1kw";
		klima1.potrosnjaGreje = "2kw";
		klima1.temperatura = 18;
		klima1.mode = "hladi";
		klima1.mesecnaPotrosnjaKW = 0;
		
		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima2.marka = "Gree";
		klima2.potrosnjaHladi = "1kw";
		klima2.potrosnjaGreje = "2kw";
		klima2.temperatura = 28;
		klima2.mode = "greje";
		klima2.mesecnaPotrosnjaKW = 0;

		
		klima1.print();
		klima2.print();
		
		klima1.mesecnaPotrosnjaStruja();
		System.out.println("Mesecna potrosnja u kW je " + klima1.mesecnaPotrosnjaKW );
		
		klima2.mesecnaPotrosnjaStruja();
		System.out.println("Mesecna potrosnja u kW je " + klima2.mesecnaPotrosnjaKW );
		
		System.out.println("Cena struje za mesec je " + klima1.mesecnaPotrosnjaNovac());
		System.out.println("Cena struje za mesec je " + klima2.mesecnaPotrosnjaNovac());


	}

}
