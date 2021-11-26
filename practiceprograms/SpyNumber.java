package com.technoelevate.practiceprograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int prod =1;
		while(n>0) {
			sum=sum+n%10;
			prod=prod*n%10;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("Spy Number");
		}
		else {
			System.out.println("Not Spy Number");
		}
	}

}
