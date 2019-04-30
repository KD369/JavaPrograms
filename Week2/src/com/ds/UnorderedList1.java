package com.ds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UnorderedList1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("F:\\Week2\\file1.txt");
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		// int a = fis.read();
		// System.out.println(a);
		int a = 0;

		// =-------------------read from file---------------------

		while ((a = fis.read()) != -1) {
			char c = (char) a;
			System.out.print(c);
		}

		// ====------------------write from file ---------ctr + c , +v
		/*
		 * while((a = fis.read()) != -1) { char c = (char)a; fos.write(c);
		 * System.out.print(c); }
		 * 
		 */
	}

}
