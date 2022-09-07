package p06_09_2022;

public class Kuca extends Objekat{
	protected int brClanova;

	public Kuca(String adresa, double povrsina, int zona, int clanovi) {
		super(adresa, povrsina, zona);
		this.brClanova = clanovi;
		// TODO Auto-generated constructor stub
	}
	
	

	public int getBrClanova() {
		return brClanova;
	}



	public void setBrClanova(int brClanova) {
		this.brClanova = brClanova;
	}



	@Override
	public double porez() {
		// TODO Auto-generated method stub
		return this.koeficijent() * this.getPovrsina();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Br clanova:" + this.brClanova);
		System.out.println("Povrsina:" + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());
	}
	
	
	
	
}
