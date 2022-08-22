package p22_08_2022;

public class Reziser {
	private String imePrezime;
	private int starost;
	
	public Reziser ( String imePrezime, int starost) {
		this.imePrezime = imePrezime;
		this.starost = starost;
	}
	
	public void print () {
		System.out.println(this.imePrezime + ", " + this.starost);
	}
	
	public String getImePrezime () {
		return this.imePrezime;
	}
	
	public void setImePrezime ( String imePrezime ) {
		this.imePrezime = imePrezime;
	}
	
	public int getStarost () {
		return this.starost;
	}
	
	public void setStarost ( int starost) {
		this.starost = starost;
	}
	
	
}
