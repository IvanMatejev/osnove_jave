package p05_09_2022;

public class Visa extends PlatnaKartica {
	private String ovlascenoLice;

	public Visa(double suma, String broj, int godinaDo, int mesecDo, String ovlascenoLice) {
		super(suma, broj, godinaDo, mesecDo);
		this.ovlascenoLice = ovlascenoLice;
		// TODO Auto-generated constructor stub
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	@Override
	public void izvrsiTranskciju( int suma) {
		// TODO Auto-generated method stub
		this.suma = this.suma - suma - (suma * 1.8)/100;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Visa card: " + this.broj + ", ");
		System.out.print(this.mesecDo + "/" + this.godinaDo + ", ");
		System.out.println("$" + this.suma);
	}
	
	
	
	
}
