package p05_09_2022;

public class TimeControl extends Control {
	private boolean pomeraVreme;
	
	

	public TimeControl( boolean pomeri) {
		super();
		this.pomeraVreme = pomeri;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void izvrsiAkciju(VideoPlayer VideoPlayer) {
		// TODO Auto-generated method stub
		int trenutnoVreme = VideoPlayer.getTrenutnoVremeVidea();
		if ( this.pomeraVreme == false ) {
			if ( trenutnoVreme - 15 >= 0) {
				trenutnoVreme-=15;
			}
		}else {
			if( trenutnoVreme + 15 <= VideoPlayer.getDuzina()) {
				trenutnoVreme += 15;
			}
		}
		VideoPlayer.setTrenutnoVremeVidea(trenutnoVreme);
	}
}
