package p19_08_2022;

public class Zadatak1_tacka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(30, 40);
		
		t2.print();
		t1.print();
		
		t1.setX(15);
		t1.setY(25);
		
		t1.print();
		
		System.out.println(t2.getX() + ", " + t2.getY());
		

	}

}
