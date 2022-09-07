package p06_09_2022;

import java.util.ArrayList;

public class Zadatak2_dodaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Proizvod> porudzbina = new ArrayList<Proizvod>();
		Pica pica = new Pica(100);
		pica.ubaciDodatak(new Dodatak("kecap", 20));
		pica.ubaciDodatak(new Dodatak("pavlaka", 20));
		pica.ubaciDodatak(new Dodatak("majonez", 20));
		
		IcePoint vanila = new IcePoint("vanila", false);
		vanila.ubaciDodatak(new Dodatak("preliv jadoda", 25));
		vanila.ubaciDodatak(new Dodatak("plazma", 35));
		
		IcePoint cokolada = new IcePoint("cokolada", true);
		cokolada.ubaciDodatak(new Dodatak("keks", 65));
		cokolada.ubaciDodatak(new Dodatak("visnja", 55));
		
		porudzbina.add(cokolada);
		porudzbina.add(vanila);
		porudzbina.add(pica);
		
		for ( int i = 0; i < porudzbina.size(); i++ ) {
			porudzbina.get(i).stampajDodatke();
		}
		
		int suma = 0;
		for ( int i = 0; i < porudzbina.size(); i++ ) {
			suma += porudzbina.get(i).ukupnaCenaDodataka();
		}
		System.out.println("Ukupna cena porudzbine je: " + suma);
	}

}
