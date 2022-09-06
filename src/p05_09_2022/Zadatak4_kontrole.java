package p05_09_2022;

import java.util.ArrayList;

public class Zadatak4_kontrole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoPlayer plejer = new VideoPlayer(200, 50, 0, 360);
		TimeControl time = new TimeControl(false);
		AudioControl audio = new AudioControl(false);
		QOControl kvalitet = new QOControl(50);
		time.izvrsiAkciju(plejer);
		time.izvrsiAkciju(plejer);
		time.izvrsiAkciju(plejer);
		time.izvrsiAkciju(plejer);
		audio.izvrsiAkciju(plejer);
		kvalitet.izvrsiAkciju(plejer);
		plejer.print();
		
		
		

	}

}
