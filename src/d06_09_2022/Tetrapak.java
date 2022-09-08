package d06_09_2022;

public  class Tetrapak extends Ambalaza {
	private boolean reciklaza;
	private int osnovnaCena;
	
	public Tetrapak(String barkod, String naziv, int neto, int bruto, boolean reciklaza, int cena) {
		super(barkod, naziv, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnaCena = cena;
		// TODO Auto-generated constructor stub
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double vratiMiCenu() {
		// TODO Auto-generated method stub
		if ( this.reciklaza == true ) {
			return this.tezinaPakovanja() *1.5 + this.osnovnaCena;
		}else {
			return this.osnovnaCena;
		}

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Naziv: " + this.naziv);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Tezina: " + this.bruto);
		System.out.println("Cena: " + this.osnovnaCena);
		if ( this.reciklaza == true ) {
			System.out.println("Ambalaza je od recikliranog materijala.");
		}else {
			System.out.println("Ambalaza nije od reciklovanog materijala.");
		}
	}
	
	
	
	
}
