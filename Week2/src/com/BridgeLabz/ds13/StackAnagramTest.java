package com.BridgeLabz.ds13;

import java.util.Scanner;

public class StackAnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		StackClass stack = new StackClass();
		UtilityPrimeAnagram util = new UtilityPrimeAnagram();
		int[] array = new int[168];
		array = util.Prime(number);
		array = util.Anagram(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				stack.push(array[i]);
			}
			
		}
		stack.display();
	}

}
