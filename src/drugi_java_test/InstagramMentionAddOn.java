package drugi_java_test;

public class InstagramMentionAddOn extends InstagramAddOn {
	private boolean tagovan;

	public InstagramMentionAddOn(int id, int x, int y, int sirinaDodatka, int visinaDodatka, boolean tagovan) {
		super(id, x, y, sirinaDodatka, visinaDodatka);
		this.tagovan = tagovan;
	}

	public boolean Tagovan() {
		return tagovan;
	}

	public void setTagovan(boolean tagovan) {
		this.tagovan = tagovan;
	}

	@Override
	public int minSirinaDodatka() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public int minVisinaDodatka() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void print( InstagramUser user ) {
		// TODO Auto-generated method stub
		System.out.println(this.x + ", " + this.y + " (" + this.visinaDodatka + ", " + 
				this.sirinaDodatka + " ) " + "@" + user.generisiLink());
	}
	
	
	
	
}
