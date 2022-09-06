package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3_figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figure = new ArrayList<Figura>();
//		JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(2);
//		JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(3);
//		Pravougaonik pravougaonik1 = new Pravougaonik(5, 4);
//		Pravougaonik pravougaonik2 = new Pravougaonik(2, 3);
//		Pravougaonik pravougaonik3 = new Pravougaonik(6, 7);
		figure.add(new JednakostranicniTrougao(2));
		figure.add(new JednakostranicniTrougao(3));
		figure.add(new Pravougaonik(5, 4));
		figure.add(new Pravougaonik(2, 3));
		figure.add(new Pravougaonik(6, 7));
		
		for ( int i = 0; i < figure.size(); i++ ) {
			figure.get(i).print();
			System.out.println();
		}
		
		int povrsina = 0;
		int obim = 0;
		for ( int i = 0; i < figure.size(); i ++ ) {
			povrsina += figure.get(i).povrsina();
			obim += figure.get(i).obim();
		}
		System.out.println("Ukupna povrsina je " + povrsina);
		System.out.println("Ukupan obim je " + obim);
	}

}
