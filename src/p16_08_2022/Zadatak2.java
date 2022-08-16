package p16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.Zad
//		Krairti klasu SlackMessage koja ima:
//		tekst poruke
//		ime i prezime osobe koja je stavila poruku
//		datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//		U glavnom programu kreirati 2 slack poruke sa proizvoljnim
//		podacima i ostampati obe poruke u formatu:
//		[ime i prezime osobe] - [kad je poslata]
//		[Tekst poruke]
		SlackMessage poruka1 = new SlackMessage();
		poruka1.tekst = "Hello World!";
		poruka1.imePrezime = "Pera Peric";
		poruka1.datumVreme = "1.1.2021. 11:11";
		
		SlackMessage poruka2 = new SlackMessage();
		poruka2.tekst = "Hello Nis!";
		poruka2.imePrezime = "Mitar Miric";
		poruka2.datumVreme = "1.1.2022. 22:22";
		
//		System.out.println(poruka1.imePrezime + " - " + poruka1.datumVreme);
//		System.out.println(poruka1.tekst);
//		System.out.println();
//		System.out.println(poruka2.imePrezime + " - " + poruka2.datumVreme);
//		System.out.println(poruka2.tekst);
		
		poruka1.print();
		poruka2.print();
		
		


	}

}
