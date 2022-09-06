package d05_09_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

	public Menadzer(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double plata() {
		// TODO Auto-generated method stub
		int zbirPlata = 0;
		for ( int i = 0; i < this.sektori.size(); i++ ) {
			zbirPlata += this.sektori.get(i).getPlata();
		}
		return zbirPlata;
	}

	
	
	
}
