package com.nasir.traveler;

public class BankNotesCount {

	public void bankNotesCount(int bnotes[], int amount) {
		// TODO Auto-generated method stub
		int bnotesCounter[]= new int[bnotes.length];
		try {
			for(int i=0;i< bnotes.length;i++) {
				if(amount> bnotes[i]) {bnotesCounter[i] = amount / bnotes[i];
				amount= amount-bnotesCounter[i] * bnotes[i];
				}
			}
			if(amount> 0) {
				System.out.println("Exact amount cannot be given with the highest Denomination ");
			} else {System.out.println("Your payment approach in order to give min of notes will be ");
	       }		for(int i=0; i< bnotes.length;i++) {
					if(bnotesCounter[i] !=0) {System.out.println(bnotes +":"+ bnotesCounter[i]);

					}
	       		}
		}	catch(ArithmeticException e) { System.out.println(e+ "Note of Denomination 0 is invalid");
	}
  }
}