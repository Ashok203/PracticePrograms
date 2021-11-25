package com.technoelevate.practiceprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int value = sc.nextInt();
		int temp = value;
		int sum = 0;
		while (value > 0) {
			int rem = value % 10;
			sum = sum + (rem * rem * rem);
			value /= 10;
		}
		if(sum==temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
