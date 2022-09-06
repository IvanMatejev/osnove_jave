package p05_09_2022;

public class AudioControl extends Control {
	private boolean pojacivac;

	public AudioControl( boolean akcija ) {
		super();
		this.pojacivac = akcija;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsiAkciju(VideoPlayer VideoPlayer) {
		// TODO Auto-generated method stub
		int trenutnaJacina = VideoPlayer.getJacinaZvuka();
		if ( this.pojacivac == false ) {
			if ( trenutnaJacina - 1 >= 0) {
				trenutnaJacina-=1;
			}
		}else {
			if( trenutnaJacina + 1 <= 100) {
				trenutnaJacina +=1;
			}
		}
		
		VideoPlayer.setJacinaZvuka(trenutnaJacina);
	}
	
	
	
	
}
