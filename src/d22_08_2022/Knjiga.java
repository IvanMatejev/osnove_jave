package d22_08_2022;

public class Knjiga {
	private String isbn;
	private int godinaIzdanja;
	private String naziv;
	private Autor autor;
	
	
	
	public Knjiga(String isbn, int godinaIzdanja, String naziv, Autor autor) {
		super();
		this.isbn = isbn;
		this.godinaIzdanja = godinaIzdanja;
		this.naziv = naziv;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	} 
	
	public void print () {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		this.autor.print();
	}
	
	
}
