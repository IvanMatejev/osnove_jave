package d06_09_2022;

public class Zadatak2_planinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaninarskiDom dom = new PlaninarskiDom("Nas dom", 2022);
		Planina rtanj = new Planina("Rtanj", "Srbija", 2851);
		
		dom.uclaniPlaninara(new RekreativniPlaninar("010", "Pera Peric", 15, "zajecarski", 1800));
		dom.uclaniPlaninara(new RekreativniPlaninar("007", "Vladan Jocic", 25, "niski", 1600));
		dom.uclaniPlaninara(new RekreativniPlaninar("005", "Vera Matic", 10, "pirotski", 4500));
		
		dom.uclaniPlaninara(new Alpinista("001", "Veran Matic", 5));
		dom.uclaniPlaninara(new Alpinista("002", "Ivan Matejev", 10));
		dom.uclaniPlaninara(new Alpinista("003", "Zoki Planinar", 15));
		
		for ( int i = 0; i < dom.getClanovi().size(); i++ ) {
			dom.getClanovi().get(i).uspesanUspon(rtanj);
		}
		
		dom.print();
		
		System.out.println("Uspon na planinu" + rtanj.getIme() + ", Visina: " + rtanj.getVisina());
		System.out.println("Broj popelih planinara: " + dom.brojPopelihPlaninara(rtanj));
		System.out.println("Mesecni prihod doma je: " + dom.mesecniPrihodDoma());
		System.out.println();
		dom.izbaciPlaninara("003");
		dom.print();
		
		
	}

}
