package d06_09_2022;

public class RekreativniPlaninar extends Planinar {
	private int tezinaOpreme;
	private String okrugPlaninara;
	private int usponBezOpreme;
	
	public RekreativniPlaninar(String jci, String punoIme, int tezinaOpreme, String okrug, int usponBezOpreme) {
		super(jci, punoIme);
		this.tezinaOpreme = tezinaOpreme;
		this.okrugPlaninara = okrug;
		this.usponBezOpreme = usponBezOpreme;
		// TODO Auto-generated constructor stub
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getOkrugPlaninara() {
		return okrugPlaninara;
	}

	public int getUsponBezOpreme() {
		return usponBezOpreme;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Rekreativac, id: " + this.jci);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Okrug: " + this.okrugPlaninara);
	}

	@Override
	public int dajMiClanarinu() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		// TODO Auto-generated method stub
		if ( this.usponBezOpreme + this.tezinaOpreme * 50 >= planina.getVisina()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	

}
