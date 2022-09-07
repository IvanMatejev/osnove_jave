package p06_09_2022;

public class Pica extends Proizvod {
	private int cenaPodloge;

	public Pica( int cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
		// TODO Auto-generated constructor stub
	}

	public int getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(int cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public int ukupnaCenaDodataka() {
		// TODO Auto-generated method stub
		return this.cenaSvihDodataka() + this.cenaPodloge;
	}

	@Override
	public void stampajDodatke() {
//		 TODO Auto-generated method stub
		System.out.println("Pica:");
		for ( int i = 0; i < this.dodaci.size(); i++ ) {
			this.dodaci.get(i).print();
		}
		System.out.println("Ukupna cena: " + this.ukupnaCenaDodataka());
		System.out.println();
	}
	
}
