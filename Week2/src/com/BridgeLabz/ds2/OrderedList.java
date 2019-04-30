package com.BridgeLabz.ds2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedList {
	static Node head;

	public OrderedList(Node head) {

		this.head = null;
	}

	// add
	public void add(int item) {

		Node node = new Node();

		node.data = item;
		node.next = head;
		head = node;

	}

	// remove
	public void remove() {
		Node node = head;
		head = node.next;
	}

	// search
	public boolean search(Node head, int item) {
		Node current = head;
		while (current.data != null) {
			if ((int) current.data == item) {
				return true;
			} else {
				current = current.next;
			}
		}
		return false;
	}

	// isEmpty
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	// pop
	public int pop() {

		return 0;

	}

	// pop(pos)
	// size
	public int size() {

		int count = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	// index

	public int index(int item) {
		int count = 0;
		Node current = head;
		while (current != null) {
			if ((int) current.data == item) {
				return count;
			} else {
				current = current.next;
				count++;
			}

		}
		return count;
	}

	// display
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) throws Exception {
		OrderedList list = new OrderedList(head);
		File file = new File("file.txt");
		Scanner scanner = new Scanner(file);
		Scanner scanner1 = new Scanner(System.in);
		int len = (int) file.length();
		int array[] = new int[len];
		int i = 0;
		int number;
		while (scanner.hasNext()) {
			number = scanner.nextInt();
			array[i] = number;
			i++;

		}

		Arrays.sort(array);
		for (int j = array.length - 1; j >= 0; j--) {
			if (array[j] != 0)
				list.add(array[j]);
		}

		list.display();
		System.out.println("Search is " + list.search(head, 30));
		System.out.println("Remove from top ");
		list.remove();
		list.display();
		System.out.println("Is list empty ? " + list.isEmpty());
		System.out.println("Size of the list is " + list.size());
		System.out.println("Index of an element " + list.index(50));
	}

}
