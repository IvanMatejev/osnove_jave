package p26_08_2022;

public class MasterKartica extends PlatnaKartica {

	public MasterKartica(int suma, String broj, int godina, int mesec) {
		super(suma, broj, godina, mesec);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void izvrsiTransakciju ( double isplata) {
		double provizija = 1.5 / 100 * isplata;
		this.suma = this.suma - isplata - provizija;
	}
	@Override
	public void print () {
		System.out.print("Master Card: ");
		super.print();
	}
}
