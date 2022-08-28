package p26_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kamion kamion = new Kamion("ni123", "volvo", 120, 1500, 240);
		
		Vozilo v = new Vozilo("ni12345", "bmw", 100, 2000, 120);
		
//		kamion.setBrzina(100);
//		kamion.setKubikaza(1000);
//		kamion.setMarka("volvo");
//		kamion.setRegistracija("ni123456");
//		kamion.setMaxBrzina(240);
//		
//		kamion.print();
//		
//		Auto auto = new Auto();
		
		kamion.stampaj();
		
		
	}

}
