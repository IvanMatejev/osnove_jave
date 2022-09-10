package drugi_java_test;

public class InstagramLocationAddOn extends InstagramAddOn {
	private String nazivLokacije;

	public InstagramLocationAddOn(int id, int x, int y, int sirinaDodatka, int visinaDodatka, String nazivLokacije) {
		super(id, x, y, sirinaDodatka, visinaDodatka);
		this.nazivLokacije = nazivLokacije;
	}

	public String getNazivLokacije() {
		return nazivLokacije;
	}

	public void setNazivLokacije(String nazivLokacije) {
		this.nazivLokacije = nazivLokacije;
	}

	@Override
	public int minSirinaDodatka() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int minVisinaDodatka() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void print( InstagramUser user ) {
		// TODO Auto-generated method stub
		System.out.println(this.x + ", " + this.y + " (" + this.visinaDodatka + ", " + 
							this.sirinaDodatka + " ) L " + this.nazivLokacije);
	}
	
	
}
