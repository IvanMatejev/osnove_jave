package d26_08_2022;

public class Trener extends Osoba {
	private int godineIskustva;
	private String tip;
	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trener(String punoIme, String jmbg, int godinaRodj, int godineIskustva, String tip) {
		super(punoIme, jmbg, godinaRodj);
		this.godineIskustva = godineIskustva;
		this.tip = tip;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print () {
		super.print();
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tip);
	}
	
	
	
}
