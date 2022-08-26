package p25_08_2022;

public class Zadatak2_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookPost post = new FacebookPost("Pera Peric", "Idemo Nis");
		
		Reakcija r1 = new Reakcija("smajli", "Miki");
		Reakcija r2 = new Reakcija("like", "Miki");
		Reakcija r3 = new Reakcija("srce", "Laza");
		Reakcija r4 = new Reakcija("like", "Laza");
		Reakcija r5 = new Reakcija("smajli", "Pera");
		Reakcija r6 = new Reakcija("srce", "Ana");
		
		
		post.reagovao(r1);
		post.reagovao(r2);
		post.reagovao(r3);
		post.reagovao(r4);
		post.reagovao(r5);
		post.reagovao(r6);
		post.print();

	}

}
