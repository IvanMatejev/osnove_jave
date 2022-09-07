package p06_09_2022;

public class Zgrada extends Objekat {
	private int brStanova;

	public Zgrada(String adresa, double povrsina, int zona, int stanovi) {
		super(adresa, povrsina, zona);
		this.brStanova = stanovi;
		// TODO Auto-generated constructor stub
	}

	public int getBrStanova() {
		return brStanova;
	}

	public void setBrStanova(int brStanova) {
		this.brStanova = brStanova;
	}

	@Override
	public double porez() {
		// TODO Auto-generated method stub
		return this.koeficijent() * this.getPovrsina()*this.brStanova;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Br stanova:" + this.brStanova);
		System.out.println("Povrsina:" + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());
		
	}
	
	
	
	
}
