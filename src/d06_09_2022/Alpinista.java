package d06_09_2022;

public class Alpinista extends Planinar {
	private int osvojeniPoeni;

	public Alpinista(String jci, String punoIme, int poeni) {
		super(jci, punoIme);
		this.osvojeniPoeni = poeni;
		// TODO Auto-generated constructor stub
	}

	public int getOsvojeniPoeni() {
		return osvojeniPoeni;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Alpinista, id: " + this.jci);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Broj poena:" + this.osvojeniPoeni);
		
	}

	@Override
	public int dajMiClanarinu() {
		// TODO Auto-generated method stub
		return 1500 - this.osvojeniPoeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		// TODO Auto-generated method stub
		if ( planina.getVisina() < 4000 ) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
