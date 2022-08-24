package d22_08_2022;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga() {
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu ( double tezina ) {
		if ( this.mernaJedinica.equals("kg")) {
			return tezina * this.proizvod.getCenaKg();
		}
		return tezina * this.proizvod.getCenaLb();
	}
	
	public void print () {
		this.proizvod.print();
		if (this.proizvod.getCenaKg() != 0) {
			System.out.println(this.proizvod.getCenaKg() + " " + this.mernaJedinica  + " * " + this.sracunajCenu(10) / this.proizvod.getCenaKg());
			System.out.println("Ukupna cena: " + this.sracunajCenu(10));
		}
		else if (this.proizvod.getCenaLb() != 0) {
			System.out.println(this.proizvod.getCenaLb() + " " +  this.mernaJedinica  + " * " + this.sracunajCenu(5) / this.proizvod.getCenaLb());
			System.out.println("Ukupna cena: " + this.sracunajCenu(5));
		}
	}
	
	
}
