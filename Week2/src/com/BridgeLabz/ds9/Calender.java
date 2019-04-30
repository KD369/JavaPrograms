package com.BridgeLabz.ds9;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month :");
		int month = scanner.nextInt();
		System.out.println("Enter year :");
		int year = scanner.nextInt();
		CalenderQueueUtil calendar = new CalenderQueueUtil();
		calendar.calendarQueue(month, year);

	}

}
