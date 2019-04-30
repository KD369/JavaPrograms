package com.BridgeLabz.ds13;

import java.util.Scanner;

public class QueueAnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		
		UtilityPrimeAnagram util = new UtilityPrimeAnagram();
		QueueClass queue = new QueueClass();
		int[] array = new int[168];
		
		array = util.Prime(number);
		array = util.Anagram(array);
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				queue.enqueue(array[i]);
			}
		}
		queue.display();
	}

}
