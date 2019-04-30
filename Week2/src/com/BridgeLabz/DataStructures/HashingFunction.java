package com.BridgeLabz.DataStructures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashingFunction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Read the numbers from the file
		FileInputStream fis = new FileInputStream("file2.txt");

		int a = 0;
		while ((a = fis.read()) != -1) {
			char y = (char) a;
			System.out.print(y);
		}
		System.out.println();
		// enter the number to be search
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be search : ");
		int number = scanner.nextInt();
		

	}

}
