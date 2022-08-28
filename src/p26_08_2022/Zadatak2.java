package p26_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisaKartica visa = new VisaKartica(500, "111-222", 2002, 8, "Pera");
		MasterKartica master = new MasterKartica(1000, "555-555", 2005, 12);
		
		visa.izvrsiTransakciju(10);
		master.izvrsiTransakciju(20);
		
		visa.print();
		master.print();
	}

}
