package com.ds1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new FileInputStream("file1.txt"));
	/*	FileInputStream fis = new FileInputStream("file1.txt");
		
		int a  = 0;
		while((a = fis.read()) != -1) {
			char c = (char) a;
			System.out.print(c);
		}*/
		
		
		String str=null;
		while(scanner.hasNext()){
			str=scanner.next();
			String[] s = str.split(" ");
			for(String s1 : s) {
				System.out.println(s1);
			}
		}   
			
		/*String word = "Hello;world ;!!";
		String[] w = word.split(";");
		for(String w1 : w) {
			System.out.println(w1);
		}
		*/	
		}
		
	}


