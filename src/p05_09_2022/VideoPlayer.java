package p05_09_2022;

public class VideoPlayer {
	private int duzina;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;
	public VideoPlayer(int duzina, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzina = duzina;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void print () {
		System.out.println("Duzina videa:" + this.duzina);
		System.out.println("Trenutno vreme: " + this.trenutnoVremeVidea );
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
		System.out.println("Kvalitet videa: " + this.kvalitetVidea);
	}
}
