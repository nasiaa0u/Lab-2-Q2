package com.nasir.traveler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortTraveler mergeSortTraveler = new MergeSortTraveler();
		BankNotesCount bankNotesCount= new BankNotesCount();
		
		System.out.println("Enter The Size of Currency Denomination ");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[] bnotes= new int[size];
		System.out.println("Enter Currency Denomination Values ");
		for (int i=0; i< size; i++) {
		bnotes[i]= sc.nextInt();
		
		}
		System.out.println("Enter The Amount You Want To Pay ");
		int amount = sc.nextInt();
		
		
		//mergeSortTraveler.sort(bnotes ,0,bnotes.length-1);
		bankNotesCount.bankNotesCount(bnotes,amount);
	}

}
