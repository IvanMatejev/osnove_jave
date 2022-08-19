package d18_08_2022;

public class SmartAirConditioning {
	public String marka;
	public String potrosnjaHladi;
	public String potrosnjaGreje;
	public int temperatura;
	public String mode;
	public int mesecnaPotrosnjaKW;
	
	public void print () {
		System.out.println(this.marka + " - " + this.mode + " - " + this.temperatura );
	}
	
	public void mesecnaPotrosnjaStruja () {
//		metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
		if ( this.mode.equals("hladi") ) {
			this.mesecnaPotrosnjaKW += 30 * 15 ;
		}else {
			this.mesecnaPotrosnjaKW += 30 * 15 * 2 ;
		}
		
	}
	
	public int mesecnaPotrosnjaNovac () {
//		metodu koja racuna koliko klima novca potrosi za mesec dana
//		Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//		Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//		Metoda vraca ukupnu cenu za taj mesec
		int potrosnjaNovac = 0;
		for ( int i = 0 ; i < this.mesecnaPotrosnjaKW ; i++) {
			if( i < 350 ) {
				potrosnjaNovac += 6;
			}else {
				potrosnjaNovac +=9;
			}
			
		}
		return potrosnjaNovac;
		
	}
	
	

}
