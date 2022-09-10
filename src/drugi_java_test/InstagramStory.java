package drugi_java_test;

import java.util.ArrayList;

public class InstagramStory {
	private String autor;
	private String swipeUp;
	private String linkDoSlike;
	private ArrayList<InstagramAddOn> dodaci = new ArrayList<InstagramAddOn>();
	private ArrayList<InstagramUser> korisnici = new ArrayList<InstagramUser>();
	
	public InstagramStory(String autor, String swipeUp, String linkDoSlike) {
		super();
		this.autor = autor;
		this.swipeUp = swipeUp;
		this.linkDoSlike = linkDoSlike;
	}

	public String getSwipeUp() {
		return swipeUp;
	}

	public void setSwipeUp(String swipeUp) {
		this.swipeUp = swipeUp;
	}

	public String getAutor() {
		return autor;
	}

	public String getLinkDoSlike() {
		return linkDoSlike;
	}

	public ArrayList<InstagramAddOn> getDodaci() {
		return dodaci;
	}

	public ArrayList<InstagramUser> getKorisnici() {
		return korisnici;
	}
	
	public void dodajDodatak ( InstagramAddOn dodatak ) {
		this.dodaci.add(dodatak);
	}
	
	public void obrisiDodatak ( int id ) {
		for ( int i = 0 ; i < this.dodaci.size(); i++ ) {
			if ( this.dodaci.get(i).getId() == id ) {
				this.dodaci.remove(i);
			}
		}
	}
	
	private boolean daLiJePogledaoStori ( String username ) {
		boolean pogledao = true;
		for ( int i = 0; i < this.korisnici.size(); i++ ) {
			if ( !this.korisnici.get(i).getUsername().equals(username)) {
				pogledao = false;
			}
		}
		return pogledao;
	}
	
	public void pogledajStori ( InstagramUser user ) {
		if ( this.daLiJePogledaoStori(user.getUsername()) == false ) {
			this.korisnici.add(user);
		}
	}
	
	public void postaviStori () {
		System.out.println("Autor: " + this.autor);
		for ( int i = 0 ; i < this.dodaci.size(); i++ ) {
			this.dodaci.get(i).print(this.korisnici.get(i));
		}
		if ( !this.swipeUp.equals("") ) {
			System.out.println("Swipe up:" + this.swipeUp);
		}
	}
	
	public int brojPregleda() {
		return this.korisnici.size();
	}
	
	public void stampajKorisnikeKojiSuPogledali () {
		System.out.println("Viewers: " + this.brojPregleda());
		for ( int i = 0; i < this.korisnici.size(); i++ ) {
			this.korisnici.get(i).print();
		}
	}
	
	
}
