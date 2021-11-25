package com.technoelevate.practiceprograms;

import java.util.Scanner;

public class SortingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int a[] = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("my array");
		for (int j = 0; j <= 4; j++) {
			System.out.println(a[j]);
		}

		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
