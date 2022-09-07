package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
	private String ime;
	private String tip;
	ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();
	public Disciplina(String ime, String tip) {
		super();
		this.ime = ime;
		this.tip = tip;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public ArrayList<Atleticar> getAtleticari() {
		return atleticari;
	}
	
	
	public void dodajAtleticara ( Atleticar atleticar ) {
		atleticari.add(atleticar);
		
	}
	public void diskvalifikujAtleticara ( String ime ) {
		for ( int i = 0; i < this.atleticari.size(); i++) {
			if (this.atleticari.get(i).getPunoIme().equals(ime)) {
				this.atleticari.remove(i);
			}
		}
	}
	
	public Atleticar nadjiNajboljeg () {
		Atleticar najbolji = this.atleticari.get(0);
		for ( int i = 0; i < this.atleticari.size(); i++ ) {
			if ( this.atleticari.get(i).uporediRezultat(najbolji)) {
				najbolji = this.atleticari.get(i);
			}
		}
		return najbolji;
	}
	
	public void stampajNajboljeg () {
		Atleticar najbolji = this.atleticari.get(0);
		for ( int i = 0; i < this.atleticari.size(); i++ ) {
			if ( this.atleticari.get(i).uporediRezultat(najbolji)) {
				najbolji = this.atleticari.get(i);
			}
		}
		najbolji.print();
	}
	
}
