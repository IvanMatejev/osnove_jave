package d26_08_2022;

public class Zadatak1_osoba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Igrac igrac1 = new Igrac("Ivan Matejev", "1808993750027", 1993, 8, "nazad", false);
		Igrac igrac2 = new Igrac("Pera Peric", "41565656", 1988, 6, "napred", true);
		
		Trener trener1 = new Trener("Miki Legenda", "55454545", 1958, 30, "glavni");
		Trener trener2 = new Trener("Dragan Dragic", "26262626", 1955, 35, "kondicioni");
		
		igrac1.print();
		igrac2.print();
		System.out.println();
		trener1.print();
		trener2.print();
		
	}

}
