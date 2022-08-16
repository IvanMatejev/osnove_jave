package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean pravougli=daLiJePravougli (3, 4, 5);
		if( pravougli == true) {
			System.out.println("Trougao je pravougli");
		}else {
			System.out.println("Trougao nije pravougli");
		}	
	}
	
	public static boolean daLiJePravougli( int a, int b, int c) {
		if(a*a + b*b == c*c) {
			return true;
		}else {
			return false;
		}
	}

}
