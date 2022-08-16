package p15_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFirstName("Ivan");
		printSecondName("Matejev");
		printFirstName("Ivan");
		printSecondName("Matejev");
		printFirstName("Ivan");
		printSecondName("Matejev");
		printFirstName("Ivan");
		printSecondName("Matejev");
	}
	
	public static void printFirstName( String firstName) {
		System.out.print(firstName);
	}
	
	public static void printSecondName( String secondName ) {
		System.out.println(" " + secondName );
	}

}
