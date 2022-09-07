package p06_09_2022;

public class Lokal extends Objekat {

	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double porez() {
		// TODO Auto-generated method stub
		return this.koeficijent() * this.getPovrsina() * 1.3;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Povrsina:" + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());
		
	}
	
	
}
