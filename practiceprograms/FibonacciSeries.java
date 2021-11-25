package com.technoelevate.practiceprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		int val1 = 0;
		int val2 = 1;
		int sum;
		System.out.println(val1);
		System.out.println(val2);
		for (int i = 2; i <= num; i++) {
			sum = val1 + val2;
			System.out.println(sum);
			val1 = val2;
			val2 = sum;
		}
		System.out.println();
	}

}
