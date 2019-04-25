package com.ds1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedList<T> {

	Node head = null;
	

	// insert element
	public void add(T item) {

		Node newNode = new Node();

		newNode.data = item;
		newNode.next = head;
		head = newNode;

	}

	// display
	public void display() {
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}

	}

	// is empty
	public void isEmpty() {
		Node node=head;
		if(node==null)
		{
			
			System.out.println("linkedlist is empty");
		}
		else
		{
			System.out.println("linkedlist contain element :");
		}
	}

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

	// search
	public boolean search(Node head,T item) {

		Node node=head;
		while(node!=null)
		{
			if(node.data.equals(item))
			{
				return true;
			}
			else
			{
				node=node.next;
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		File file = new File("file1.txt");
		Scanner scanner = new Scanner(file);
		Scanner scanner1=new Scanner(System.in);
		while(scanner.hasNext())
		{
			String str=scanner.next();
			list.add(str);
		}
		
		list.display();
		list.isEmpty();
		int len = list.size();
		System.out.println("Size of the list : " + len);
		System.out.println("Enter string to search ");
		String string=scanner1.next();
		if(list.search(list.head,string))
		{
			System.out.println("element found  ");
		}
		else
		{
			System.out.println("element not found");
		}
		
	}

}
