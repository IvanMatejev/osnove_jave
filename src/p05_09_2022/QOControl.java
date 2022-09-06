package p05_09_2022;

public class QOControl extends Control{
	private double brzinaInterneta;

	public QOControl( double brzinaInterneta ) {
		super();
		this.brzinaInterneta = brzinaInterneta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void izvrsiAkciju(VideoPlayer VideoPlayer) {
		// TODO Auto-generated method stub
		double x = this.brzinaInterneta * 10.1;
		if ( x < 244 ) {
			VideoPlayer.setKvalitetVidea(240);
		}else if ( x < 480 ) {
			VideoPlayer.setKvalitetVidea(480);
		}else {
			VideoPlayer.setKvalitetVidea(720);
		}
		
	}
	
	
	
	
}
