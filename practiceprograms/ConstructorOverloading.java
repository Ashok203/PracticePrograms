package com.technoelevate.practiceprograms;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		System.out.println("Constructor without arguments");
	}
	ConstructorOverloading(int a){
		System.out.println("Constructor with int parameter");
	}
	ConstructorOverloading(int a,double b){
		System.out.println("Constructor with int and double parameters");
	}
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(2);
		ConstructorOverloading co2 = new ConstructorOverloading(2,2.5);
	}

}
