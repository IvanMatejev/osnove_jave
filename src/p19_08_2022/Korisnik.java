package p19_08_2022;

public class Korisnik {
	
	private String ime;
	private String prezime;
	private String email;
	
//	difoltni konstruktor
	public Korisnik () {
	}
//	konsturktor sa parametrima
	public Korisnik ( String i, String p, String e) {
		this.ime = i;
		this.prezime = p;
		this.email = e;
	}
	
	public Korisnik ( String ime ) {
		this.ime = ime;
	}
	
	public void stampaj () {
		System.out.println(this.ime);
	}
	
	public void setIme ( String ime ) {
		this.ime = ime;
	}
	
	public String getIme () {
		return this.ime ;
	}

}
