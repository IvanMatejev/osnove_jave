package p26_08_2022;

public class Student extends Osoba {
	protected String brIndeksa;
	protected int dugSkolarina;
	
	public Student (String punoIme, String jmbg) {
		super (punoIme, jmbg);
	}
	
	
	
	
	public String getBrIndeksa() {
		return brIndeksa;
	}




	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}




	public int getDugSkolarina() {
		return dugSkolarina;
	}




	public void setDugSkolarina(int dugSkolarina) {
		this.dugSkolarina = dugSkolarina;
	}




	public void uplatiSkolarinu ( int uplata ) {
		this.dugSkolarina -= uplata;
	}
	
	@Override
	public void stampaj () {
		super.stampaj();
		System.out.println("Dug: " + this.dugSkolarina);
		System.out.println("Broj indeksa: " + this.brIndeksa);
	}
	
	
}
