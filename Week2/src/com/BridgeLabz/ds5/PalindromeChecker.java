package com.BridgeLabz.ds5;

import java.util.Scanner;

public class PalindromeChecker {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String string = scanner.nextLine();

		DequeClass deque = new DequeClass();

		char[] charString = string.toCharArray();
		char i;
		int front = 0;
		int rear = 0;
		
	
		/*
		 * for(i = 0; i < charString.length-1; i++) { System.out.println(charString[i]);
		 * }
		 */
//-----------------------------------------------------------------------------
		int charLen = string.length();
		System.out.println("Store in deque");
		for (int j = 0; j < charLen; j++) {

			deque.addRear(charString[j]);

		}
		System.out.println("Display char");
		deque.display();
// ------------------------------------------------------------------------------
		System.out.println("Remove an element from front");
		for (int j = 0; j < charLen; j++) {
			char charFront = deque.removeFront();
			char charRear = deque.removeRear();
		
			if(charFront == charRear) {
				
				System.out.println("Same move to next char");
			} else {
				System.out.println("Not same char");
			}
		}
		System.out.println("remove display");
		deque.display();

		/*
		 * System.out.println("Palindrome checking"); if (removeF == removeR) { front--;
		 * rear++; System.out.println("String is Palindrome");
		 * 
		 * } else { System.out.println("not palindrome"); }
		 */

	}

}
