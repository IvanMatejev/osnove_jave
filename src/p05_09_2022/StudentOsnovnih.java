package p05_09_2022;

public class StudentOsnovnih extends Student {
	
	private int cenaSkolarine;
	
	

	public StudentOsnovnih(String punoIme, String brIndeksa, int godinaStudija, int skolarina) {
		super(punoIme, brIndeksa, godinaStudija);
		this.cenaSkolarine = skolarina;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cenaSkolarine() {
		// TODO Auto-generated method stub
		return this.cenaSkolarine;
	}

	@Override
	public boolean daLiJeNaBudzetu() {
		// TODO Auto-generated method stub
		return this.godinaStudija < 5 ;
	}
	
}
