package d23_08_2022;

public class Ringla {
	private String tip;
	private int jacina;
	private double grejacJacina;
	
	public Ringla(String tip, double grejacJacina) {
		this.jacina = 0;
		this.tip = tip;
		this.grejacJacina = grejacJacina;
	}

	public int getJacina() {
		return jacina;
	}
	
	public String getTip () {
		return this.tip;
	}
	
	public double getGrejac () {
		return this.grejacJacina;
	}
	
	
	private int maxBrojPovecavanja () {
		if (this.tip.equals("obicna")) {
			return 3;
		}
		return 12;
	}
	
	public void pojacajRinglu () {
		if ( this.jacina + 1 <= this.maxBrojPovecavanja()) {
			this.jacina += 1;
		}
	}
	
	public void iskljuciRinglu () {
		this.jacina = 0;
	}
	
	public boolean daLiJeUkljucenja () {
		return this.jacina>0;
	}
	
	public double potrosnjaStruje ( int vreme ) {
		return 100 / this.maxBrojPovecavanja() * this.jacina * this.grejacJacina * vreme;
 	}
	
	public void print () {
		if (this.daLiJeUkljucenja() == true ) {
			System.out.println("Ringla je ukljucena!");
		}else {
			System.out.println("Ringla nije ukljucena!");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Jacina grejaca: " + this.grejacJacina);
	}
	
	
	
	
}
