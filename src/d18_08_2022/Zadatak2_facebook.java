package d18_08_2022;

public class Zadatak2_facebook {

	public static void main(String[] args) {
//		2.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		
		FacebookPost post1 = new FacebookPost();
		post1.objavioPost = "Ivan Matejev";
		post1.mestoObjave = "Pera Peric";
		post1.tekstObjave = "Idemo Nis!";
		post1.brojLajkova = 10;
		post1.brojDeljenja=	20;
		
		FacebookPost post2 = new FacebookPost();
		post2.objavioPost = "Pera Detlic";
		post2.mestoObjave = "Vitez Koja";
		post2.tekstObjave = "Hello Nis!";
		post2.brojLajkova = 20;
		post2.brojDeljenja = 15;
		
		post1.like();
		post1.like();
		post1.dislike();
		post1.share();
		
		post2.like();
		post2.like();
		post2.dislike();
		post2.share();
		
		post1.print();
		post2.print();
		


	}

}
