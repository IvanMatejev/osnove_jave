package d05_09_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	public Magacioner(String punoIme) {
		super(punoIme);
		// TODO Auto-generated constructor stub
	}
	
	private double prosecnaPlataSektori () {
		int zbirPlata = 0;
		for ( int i = 0; i < this.sektori.size(); i++ ) {
			zbirPlata += this.sektori.get(i).getPlata();
		}
		return  zbirPlata / this.sektori.size() * 0.5;
	}

	@Override
	public double plata() {
		// TODO Auto-generated method stub
		return this.prosecnaPlataSektori() * this.sektori.size();
	}
}
