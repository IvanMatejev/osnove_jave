package p06_09_2022;

public class Skakac extends Atleticar {

	public Skakac(String punoIme, int rezultat) {
		super(punoIme, rezultat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean uporediRezultat(Atleticar drugi) {
		// TODO Auto-generated method stub
		if ( this.rezultat > drugi.rezultat ) {
			return true;
		}
		return false;
	}
	
}
