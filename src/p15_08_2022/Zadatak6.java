package p15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak
//		Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
//
//		Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//		N=9, print je=> * * * * * * * * * 

		printStars2();


	}
	public static void printStars( int n ) {
		
		for ( int i = 0 ; i < n ; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	
	public static void printStars2() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		for ( int i = 0 ; i <= n ; i++) {
			printStars(i);	
			
		}
	}
}
