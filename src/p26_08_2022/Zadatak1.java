package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1= new Student("Pera Peric", "1515151515151");
		student1.setBrIndeksa("001");
		student1.setDugSkolarina(1000);
		Student student2= new Student("Beki Bekic", "898989898989");
		student2.setBrIndeksa("002");
		student2.setDugSkolarina(2000);
		
		Profesor profa1 = new Profesor("Ivan Matejev", "1808993750028", "mata", 100000);
		
		
		Profesor profa2 = new Profesor("Laza Lazic", "8484848484848", "informatika", 200000);
		
		
		student1.uplatiSkolarinu(150);
		profa1.povecajPlatu(20);
		
		student1.stampaj();
		student2.stampaj();
		profa1.stampaj();
		profa2.stampaj();

	}

}
