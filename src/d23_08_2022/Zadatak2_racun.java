package d23_08_2022;

public class Zadatak2_racun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racun salje = new Racun("555-666-555", "Pera Peric", 50000);
		Racun prima = new Racun("111-222-1111", "Ivan Matejev", 10000);
		
		Transakcija transakcija1 = new Transakcija(123, salje, prima);
		
		transakcija1.print();
		
		transakcija1.izvrsiTransakciju(5000);
		
		salje.print();
		System.out.println();
		prima.print();
		
		transakcija1.izvrsiTransakciju(50000);
		salje.print();
		System.out.println();
		prima.print();
		

	}

}
