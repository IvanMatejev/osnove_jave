package d23_08_2022;

public class ElektricniSporet {
	private String marka;
	private int vremeGarancije;
	private int maxUkljucenihRingli;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;
	
	public ElektricniSporet(String marka, int vremeGarancije, int maxUkljucenihRingli, Ringla goreLevo,
			Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
		super();
		this.marka = marka;
		this.vremeGarancije = vremeGarancije;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}

	public String getMarka() {
		return marka;
	}

	public int getVremeGarancije() {
		return vremeGarancije;
	}

	public int getMaxUkljucenihRingli() {
		return maxUkljucenihRingli;
	}

	public Ringla getGoreLevo() {
		return goreLevo;
	}

	public Ringla getGoreDesno() {
		return goreDesno;
	}

	public Ringla getDoleLevo() {
		return doleLevo;
	}

	public Ringla getDoleDesno() {
		return doleDesno;
	}
	
	public void pojacaj (int pozicija ) {
		if ( pozicija == 1 ) {
			this.goreLevo.pojacajRinglu();
		}else if ( pozicija == 2 ) {
			this.goreDesno.pojacajRinglu();
		}else if ( pozicija == 3 ) {
			this.doleLevo.pojacajRinglu();
		}else if ( pozicija == 4 ) {
			this.goreDesno.pojacajRinglu();
		}
		
	}
	
	public void iskljuciRinglu ( int pozicija ) {
		if ( pozicija == 1 ) {
			this.goreLevo.iskljuciRinglu();
		}else if ( pozicija == 2 ) {
			this.goreDesno.iskljuciRinglu();
		}else if ( pozicija == 3 ) {
			this.doleLevo.iskljuciRinglu();
		}else if ( pozicija == 4 ) {
			this.goreDesno.iskljuciRinglu();
		}
	}
	
	public double ukupnaPotrosnja ( int vreme ) {
		return this.goreDesno.potrosnjaStruje(1) * this.maxUkljucenihRingli;
	}
	
	public void print () {
		System.out.println(this.marka + " - " + this.vremeGarancije + " godina garancije");
		System.out.println("Ringle:");
		System.out.println("Gore levo:");
		System.out.println("Ringla je " + this.goreLevo.daLiJeUkljucenja());
		System.out.println("Tip ringle: " + this.goreLevo.getTip());
		System.out.println("Jacina:" + this.goreLevo.getJacina());
		System.out.println("Grejac:" + this.goreLevo.getGrejac() + " kw");
		
		System.out.println("Gore desno:");
		System.out.println("Ringla je " + this.goreDesno.daLiJeUkljucenja());
		System.out.println("Tip ringle: " + this.goreDesno.getTip());
		System.out.println("Jacina:" + this.goreDesno.getJacina());
		System.out.println("Grejac:" + this.goreDesno.getGrejac() + " kw");
		
		System.out.println("Dole levo:");
		System.out.println("Ringla je " + this.doleLevo.daLiJeUkljucenja());
		System.out.println("Tip ringle: " + this.doleLevo.getTip());
		System.out.println("Jacina:" + this.doleLevo.getJacina());
		System.out.println("Grejac:" + this.doleLevo.getGrejac() + " kw");
		
		System.out.println("Dole desno:");
		System.out.println("Ringla je " + this.doleDesno.daLiJeUkljucenja());
		System.out.println("Tip ringle: " + this.doleDesno.getTip());
		System.out.println("Jacina:" + this.doleDesno.getJacina());
		System.out.println("Grejac:" + this.doleDesno.getGrejac() + " kw");
	} 
	
	
}
