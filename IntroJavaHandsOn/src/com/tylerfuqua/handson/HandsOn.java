package com.tylerfuqua.handson;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSunny = true;
		boolean atBeach = true;
		
		if (isSunny) {
			System.out.println("wear sunglasses!");
			if (atBeach) {
				System.out.println("Wear sunblock!");
			} else {
				System.out.println("Don't need sunblock.");
			}
		} else {
			System.out.println("Don't need to wear sunglasses.");	
		} if (atBeach) {
			System.out.println("Come back tomorrow.");
		} else {
			System.out.println("don't go to the beach.");
		} 
	}

}
