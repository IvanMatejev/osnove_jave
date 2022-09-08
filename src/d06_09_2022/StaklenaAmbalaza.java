package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
	private int kaucija;
	private boolean placanjeKaucije;
	private int osnovnaCena;
	
	public StaklenaAmbalaza(String barkod, String naziv, int neto, int bruto, int kaucija, boolean placanjeKaucije, int cena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = cena;
		// TODO Auto-generated constructor stub
	}

	public int getKaucija() {
		return kaucija;
	}

	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}

	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
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
		if ( this.placanjeKaucije == true ) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}else {
			return this.osnovnaCena * 1.2;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Naziv: " + this.naziv);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Tezina: " + this.bruto);
		System.out.println("Cena: " + this.osnovnaCena);
		if ( this.placanjeKaucije == true ) {
			System.out.println("Kaucija se placa.");
			System.out.println("Kaucija je " + this.kaucija);
		}else {
			System.out.println("Kaucija se ne placa.");
		}
	}
	
	
	
	
}
