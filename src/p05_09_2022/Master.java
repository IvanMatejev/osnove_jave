package p05_09_2022;

public class Master extends PlatnaKartica{

	public Master(double suma, String broj, int godinaDo, int mesecDo) {
		super(suma, broj , godinaDo, mesecDo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsiTranskciju(int suma) {
		// TODO Auto-generated method stub
		this.suma = this.suma - suma - (suma * 1.5)/100;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Master card: " + this.broj + ", ");
		System.out.print(this.mesecDo + "/" + this.godinaDo + ", ");
		System.out.println("$" + this.suma);
	}
	
	public void naplatiOdrzavanje () {
		this.suma -= 2;
	}
	
	
}
