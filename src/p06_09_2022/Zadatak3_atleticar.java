package p06_09_2022;

public class Zadatak3_atleticar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Disciplina skokUDalj = new Disciplina("Skok u dalje", "skakacka");
		Skakac skakac1 = new Skakac("Pera Perica", 7);
		Skakac skakac2 = new Skakac("Ivan Matejev", 8);
		
		skokUDalj.dodajAtleticara(skakac1);
		skokUDalj.dodajAtleticara(skakac2);
		skokUDalj.dodajAtleticara(new Skakac("Mile Milic", 10));
		skokUDalj.dodajAtleticara(new Skakac("Beki Bekic", 9));
		
		skokUDalj.stampajNajboljeg();
		skokUDalj.diskvalifikujAtleticara("Mile Milic");
		
		
		
		
		skakac1.uporediRezultat(skakac2);
		
		if( skakac1.uporediRezultat(skakac2) ) {
			System.out.print("Pobednik je ");
			skakac1.print();
		}else {
			System.out.print("Pobednik je ");
			skakac2.print();
		}
		
		Disciplina trkaPrepone = new Disciplina("trka prepone", "trkacka");
		Trkac trkac1 = new Trkac("Miki Mikic", 10);
		Trkac trkac2 = new Trkac("Nevena Gojic", 9);
		
		trkaPrepone.dodajAtleticara(trkac1);
		trkaPrepone.dodajAtleticara(trkac2);
		
		if( trkac1.uporediRezultat(trkac2) ) {
			System.out.print("Pobednik je ");
			trkac1.print();
		}else {
			System.out.print("Pobednik je ");
			trkac2.print();
		}
		
		System.out.println("Najbolji skok u dalj: ");
		skokUDalj.stampajNajboljeg();
		System.out.println();
		System.out.println("Najbolji prepone: ");
		trkaPrepone.stampajNajboljeg();

	}

}
