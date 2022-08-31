package mini_projekat;

import java.util.Scanner;

public class mini_projekat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Player igrac1 = new Player("Ivan Matejev");
		Player igrac2 = new Player("Pera Peric");
		
		XandOGame game = new XandOGame(igrac1, igrac2);
		
		game.startGame();
		
		while ( game.isGameOver() == false && game.isWinnerO() == false && game.isWinnerX() == false ) {
			if ( game.player().equals("x")) {
				System.out.println( igrac1.getPunoIme() + " je na potezu. Unesite poziciju:");
			}else {
				System.out.println( igrac2.getPunoIme() + " je na potezu. Unesite poziciju:");
			}
			
			int pozicija = s.nextInt();
			if ( game.isValidMove(pozicija) == false || game.isFieldFree(game.table, pozicija) == false ) {
				System.out.println("Nevalidan potez");
				game.playNext();
			}else {
				game.makeAMove(pozicija);
			}
				
			if ( game.gameScore() == 1) {
				System.out.println("Pobednik je " + igrac1.getPunoIme());	
			}else if (game.gameScore() == 2) {
				System.out.println("Pobednik je " + igrac2.getPunoIme());
			}
			
			game.playNext();
			game.print();
			
		}
	}

}
