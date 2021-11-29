package com.technoelevate.practiceprograms;

public class ConstructorChaining {
	ConstructorChaining() {
		System.out.println("constructor chaining without argument");
	}
	ConstructorChaining(int a){
		this();
		System.out.println("constructor chaining with int parameter");
	}
	ConstructorChaining(int a,double b){
		this(4);
		System.out.println("constructor chaining with int and double parameter");
	}
	public static void main(String[] args) {
		ConstructorChaining cc1 = new ConstructorChaining(2,3.5);
	}

}
