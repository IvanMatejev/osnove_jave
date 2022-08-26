package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
	private String postavio;
	private String tekstObjave;
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();
	
	public FacebookPost(String postavio, String tekstObjave) {
		super();
		this.postavio = postavio;
		this.tekstObjave = tekstObjave;
	}
	
	public void reagovao ( Reakcija reakcija ) {
		for ( int i = 0; i < this.reakcije.size(); i++) {
			if (this.reakcije.get(i).getReagovao().equals( reakcija.getReagovao())){
					this.reakcije.remove(i);
			}
			
		}
		this.reakcije.add(reakcija);
		
	}
	
	private int brojacReakcija (String tip) {
		int count = 0;
		for ( int i = 0; i < this.reakcije.size() ; i++ ) {
			if ( this.reakcije.get(i).getTip().equals(tip)) {
				count++;
			}
		}
		
		return count;
	}
	
	public void print () {
		System.out.println(this.postavio);
		System.out.println(this.tekstObjave);
		System.out.println("Smajli " + this.brojacReakcija("smajli") + " | " + "Srce " + this.brojacReakcija("srce") + " | " + "Like " + this.brojacReakcija("like"));
	}
	
	
	
	
	
	
}
