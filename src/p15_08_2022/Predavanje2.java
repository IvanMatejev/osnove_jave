package p15_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = sumiraj( 10, 20);
		System.out.println(z);
		double x = multiply(10.0, 0.5 );
		System.out.println(x);

	}
	
	public static int sumiraj(int a, int b) {
		int zbir = a + b ;
		return zbir;
	}
	
	public static double multiply( double a, double b) {
		return a * b;
	}

}
