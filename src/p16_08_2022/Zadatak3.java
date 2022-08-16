package p16_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.  Zadatak
//		Kreirati klasu Auto koja ima:
//		ime i prezime vozaca
//		marku automobila
//		broj vrata
//		potrosnju na 100km (npr: 10)
//		trenutnu brzinu kojom se auto krece
//		metodu za stampu koja stampa podatke u formatu:
//		[Vozac]
//			[Marka] - [br vrata]-ro vrata
//			Sa potrosnjom od [potrosnja] l na 100km
//			[Trenutna brzina auta] km/h je trenutna brzina.
		
		Auto auto1 =new Auto();
		auto1.vozac= "Miki";
		auto1.marka= "Volvo";
		auto1.vrata= 5;
		auto1.potrosnja= 10;
		auto1.trenutnaBrzina= 120;
		auto1.ogranicenje=80;
		auto1.godProizvodnje=1940;
		auto1.registrovanDo=8;
		auto1.kubika=2000;

		
		auto1.print();
		System.out.println("Ogranicenje je "+ auto1.ogranicenje);
		if( auto1.prekoracenje(auto1.ogranicenje) == true) {
			System.out.println("Prekoracili ste brzinu!");
			System.out.println("Kazna je " + auto1.kazna());
		}else {
			System.out.println("Vozite ok!");
		}
		
		System.out.println("Godina proizvodnje je " + auto1.godProizvodnje);
		
		if(auto1.oldtimer() == true ) {
			System.out.println("Auto je oldtimer");
		}else {
			System.out.println("Auto nije oldtimer");
		}
		System.out.println("Auto je registrovan do " + auto1.registrovanDo + " meseca.");
		if(auto1.istek(9) == true) {
			System.out.println("Registracija je istekla");
		}else {
			System.out.println("Auto je registrovan");
		}
		
		System.out.println("Kubikaza auta je " + auto1.kubika);
		System.out.println("Registracija za vase vozilo je " + auto1.registracija());
		
		
		
	}

}
