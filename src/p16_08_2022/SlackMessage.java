package p16_08_2022;

public class SlackMessage {
	public String tekst;
	public String imePrezime;
	public String datumVreme;
	
	public void print() {
		System.out.println(this.imePrezime + " - " + this.datumVreme);
		System.out.println(this.tekst);
	}

}
