package d18_08_2022;

public class FacebookPost {
	public String objavioPost;
	public String mestoObjave;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;
	
	public void like () {
		this.brojLajkova += 1;
	}
	
	public void dislike () {
		this.brojLajkova -= 1;
		if ( this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}
	
	public void share () {
		this.brojDeljenja += 1 ;
	}
	
	public void print () {
		System.out.println(this.objavioPost + " >>> " + this.mestoObjave);
		System.out.println(this.tekstObjave);
		System.out.println(" Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja );
	}
	
	

}
