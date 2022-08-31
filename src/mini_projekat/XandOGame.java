package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
	ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player igracX;
	private Player igracO;
	
	public XandOGame () {
		for ( int i = 0 ; i < 9; i++) {
			this.table.add(" ");
		}
	}
	
	public XandOGame ( Player igrac1, Player igrac2) {
		for ( int i = 0 ; i < 9; i++) {
			this.table.add(" ");
		}
		this.igracX = igrac1;
		this.igracO = igrac2;
	}
	
	
	
	public String player () {
		if ( this.nextPlayer.equals("x")) {
			return "x";
		}else {
			return "o";
		}
	}
	
	
	public void print () {
		for (int i = 0 ; i < this.table.size(); i++) {
			System.out.print(this.table.get(i) + "|");
			if ( i == 2 || i == 5 ) {
				System.out.println();
			}
			
		}	
	}
	
	public void startGame () {
		for ( int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = "x";
	}
	
	public boolean isGameOver () {
		if ( this.table.contains(" ")) {
			return false;
		}
		return true;
	}
	
	public boolean isFieldFree ( ArrayList<String> table, int pozicija) {
		if ( table.get(pozicija).equals("x") || table.get(pozicija).equals("o") ) {
			return false;
		}
		return true;
	}
	
	public void playNext () {
		if ( this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		}else {
			this.nextPlayer = "x";
		}
	}
	
	
	public void makeAMove ( int pozicija ) {
		if ( this.isFieldFree(table, pozicija)) {
			if ( this.nextPlayer.equals("x")) {
				table.set(pozicija, "x");
			}else if ( this.nextPlayer.equals("o")) {
					table.set(pozicija, "o");
			}
		}
	}
	
	public boolean isWinnerX () {
		if ( this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x") || 
			this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x") ||
			this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x") ||
			this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x") || 
			this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x") ||
			this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x") ||
			this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x") ||
			this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isWinnerO () {
		if ( this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o") || 
			this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o") ||
			this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o") ||
			this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o") || 
			this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o") ||
			this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o") ||
			this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o") ||
			this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isValidMove ( int pozicija ) {
		if ( pozicija >= 0 && pozicija < 9 ) {
			return true;
		}
		return false;
	}
	
	public int gameScore () {
		if ( this.isWinnerX() == true ) {
			return 1;
		}else if ( this.isWinnerO() == true) {
			return 2;
		}
		return 0;
		
	}
}
