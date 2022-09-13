package drugi_java_test;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstagramStory story = new InstagramStory("Pera Peric", "www.google.com", "link/do/slike");
		
		story.dodajDodatak(new InstagramLocationAddOn(50, 10, 30, 80, 80, "Nis"));
		story.dodajDodatak(new InstagramLocationAddOn(20, 15, 25, 95, 105, "Zajecar"));
		story.dodajDodatak(new InstagramMentionAddOn(12, 5, 5, 10, 20, true));
		story.dodajDodatak(new InstagramMentionAddOn(13, 10, 12, 20, 10, true));
		story.dodajDodatak(new InstagramMentionAddOn(14, 15, 25, 18, 28, false));
		
		story.obrisiDodatak(12);
		
		InstagramUser milan = new InstagramUser("milan_miki", "Milan Jovanovic");
		InstagramUser stefan = new InstagramUser("stefan13", "Stefan Radic");
		InstagramUser pera = new InstagramUser("pera_kida", "Pera Peric");
		
		story.postaviStori();
		story.postaviStori();
		
		
		story.pogledajStori(milan);
		story.pogledajStori(pera);
		story.stampajKorisnikeKojiSuPogledali();
	
	}

}
