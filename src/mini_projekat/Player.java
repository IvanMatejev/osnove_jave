package mini_projekat;

public class Player {
	
	private String punoIme;

	public Player(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void print () {
		System.out.println(this.punoIme);
	}
	
	
}
