package p05_09_2022;

public class Zadatak1_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOsnovnih student1 = new StudentOsnovnih("Pera Peric", "007", 4, 50000);
		StudentMaster student2 = new StudentMaster("Ivan Matejev", "008", 3, 150000);
		
		student1.print();
		System.out.println();
		student2.print();
	}

}
