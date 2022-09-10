package d23_08_2022;

public class Zadatak2_sporet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ringla goreLevo = new Ringla("obicna", 0.8); 
		Ringla goreDesno = new Ringla("Ekspres", 1.5);
		Ringla doleLevo = new Ringla("Ekspres", 1.5); 
		Ringla doleDesno = new Ringla("obicna", 0.8); 
		
		ElektricniSporet sporet = new ElektricniSporet("Beko", 5, 4, goreLevo, goreDesno, doleLevo, doleDesno);
		
		sporet.pojacaj(1);
		sporet.pojacaj(1);
		sporet.pojacaj(1);
		sporet.pojacaj(1);
		
		sporet.pojacaj(2);
		sporet.pojacaj(2);
		sporet.pojacaj(2);
		sporet.pojacaj(2);
		
		sporet.pojacaj(3);
		sporet.pojacaj(3);
		
		sporet.pojacaj(4);
		sporet.print();

	}

}
