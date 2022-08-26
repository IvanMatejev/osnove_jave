package p25_08_2022;

public class Zadatak1_sastojak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasta bolonjeze = new Pasta();
		
		Sastojak spageti = new Sastojak("spageti", 250);
		Sastojak meso = new Sastojak("meso", 800);
		Sastojak paradajz = new Sastojak("paradajz", 100);
		
		bolonjeze.dodajSastojak(spageti);
		bolonjeze.dodajSastojak(meso);
		bolonjeze.dodajSastojak(paradajz);
		
		bolonjeze.print();
		
		bolonjeze.obrisiSastojak("meso");
		
		bolonjeze.print();

	}

}
