package p06_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	protected ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
	
	public void ubaciDodatak ( Dodatak dodatak) {
		dodaci.add(dodatak);
	}
	
	public int cenaSvihDodataka () {
		int suma = 0;
		for ( int i = 0; i < this.dodaci.size(); i++ ) {
			suma += this.dodaci.get(i).getCena();
		}
		return suma;
	}
	
	public abstract int ukupnaCenaDodataka ();
	public abstract void stampajDodatke ();
}
