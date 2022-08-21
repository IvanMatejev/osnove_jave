package d19_08_2022;

public class Zadatak1_facebook {

	public static void main(String[] args) {
//		1.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		FbPost post1 = new FbPost("Ivan Matejev", "Pera Peric", "Hello World");
		FbPost post2 = new FbPost("Pera Peric", "Ivan Matejev", "Idemoooo Nis!");
		
		post1.setBrojDeljenja(10);
		post1.setBrojLajkova(20);
		
		post2.setBrojDeljenja(50);
		post2.setBrojLajkova(100);
		
		post1.dislike();
		post1.dislike();
		post1.like();
		post1.share();
		
		post2.dislike();
		post2.like();
		post2.like();
		post2.share();
		
		post1.print();
		System.out.println();
		post2.print();
		post2.like();
		
		


	}

}
