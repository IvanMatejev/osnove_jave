package drugi_java_test;

public class InstagramUser {
	private String username;
	private String punoIme;
	
	public InstagramUser(String username) {
		super();
		this.username = username;
	}

	public InstagramUser(String username, String punoIme) {
		super();
		this.username = username;
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getUsername() {
		return username;
	}
	
	public void print() {
		System.out.println("@" + this.username + "\t" + this.punoIme);
	}
	
	public String generisiLink () {
		String link = "https://www.instagram.com/" + this.username + "/";
		return link;
		
	}
}
