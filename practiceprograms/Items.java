package com.technoelevate.groceryapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
	public String itemName;
	public double priceOfItem;
	static Scanner sc = new Scanner(System.in);
	public Items(String itemName, double priceOfItem) {
		
		this.itemName = itemName;
		this.priceOfItem = priceOfItem;
	}
	static ArrayList al = new ArrayList();
	
	public static void add() {
		System.out.println("Number items to add");
		int n = sc.nextInt();
		System.out.println("Item to add");
		for(int i=0;i<n;i++) {
			al.add(sc.next());
		}
		System.out.println(n+ " item is add");
		
	}
	public static void viewItems() {
		System.out.println(al);
		
	}
	public static void modifyItems() {
		
	}
	public static void removeItems() {
		System.out.println("The item to remove");
		String str = sc.next();
		al.remove(str);
		System.out.println(al);
		
	}
	public static void menu() {
		System.out.println("Enter 1 to add the item");
		System.out.println("Enter 2 to viewItem");
		System.out.println("Enter 3 to modifyItem");
		System.out.println("Enter 4 to remove the item");
		int choice = sc.nextInt();
		
		
	}

}
