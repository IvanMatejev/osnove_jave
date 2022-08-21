package d19_08_2022;

public class FbPost {
	private String objavio;
	private String mestoObjave;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FbPost () {
		
	}
	
	public FbPost ( String objavio, String mestoObjave, String tekstObjave ) {
		this.objavio = objavio;
		this.mestoObjave = mestoObjave;
		this.tekstObjave = tekstObjave;
	}
	
	public void like () {
		this.brojLajkova +=1;
	}
	
	public void dislike () {
		this.brojLajkova -=1;
		if ( this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}
	
	public void share () {
		this.brojDeljenja += 1;
	}
	
	public void print () {
		System.out.println(this.objavio + " >>> " + this.mestoObjave);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja );
	}
	
	public void setBrojLajkova ( int brojLajkova ) {
		this.brojLajkova = brojLajkova;
	}
	
	public void setBrojDeljenja ( int brojDeljenja ) {
		this.brojDeljenja = brojDeljenja;
	}
	
	
}
