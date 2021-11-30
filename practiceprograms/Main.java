package com.technoelevate.groceryapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Items.menu();
		int num = 1;
		while(num==1) {
			System.out.println("Enter the value");
			int i =sc.nextInt();
			num=0;
			switch(i) {
			case 1:
				Items.add();
				break;
			case 2:
				Items.viewItems();
				break;
			case 3:
				Items.modifyItems();
				break;
			case 4:
				Items.removeItems();
				break;
			}
			System.out.println("Enter 1 to continue");
			Items.menu();
			num = sc.nextInt();
		}
	}

}
