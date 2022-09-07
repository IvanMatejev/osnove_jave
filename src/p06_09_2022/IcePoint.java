package p06_09_2022;

public class IcePoint extends Proizvod {
	private String tip;
	private boolean veliki;
	
	public IcePoint( String tip, boolean veliki) {
		super();
		this.tip = tip;
		this.veliki = veliki;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ukupnaCenaDodataka() {
		// TODO Auto-generated method stub
		int velicina = this.veliki ? 130 : 100;
		return this.cenaSvihDodataka() + velicina;
	}

	@Override
	public void stampajDodatke() {
		// TODO Auto-generated method stub
		System.out.println("IcePoint veliki:" + this.veliki);
		for ( int i = 0; i < this.dodaci.size(); i++ ) {
			this.dodaci.get(i).print();
		}
		System.out.println("Ukupna cena: " + this.ukupnaCenaDodataka());
		System.out.println();
	}
	
}
