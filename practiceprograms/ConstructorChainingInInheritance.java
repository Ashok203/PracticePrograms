package com.technoelevate.practiceprograms;

public class ConstructorChainingInInheritance {
	ConstructorChainingInInheritance(int a) {
		System.out.println("constructor chaining without arguments");
	}
}
	class Constructor extends ConstructorChainingInInheritance{
		public Constructor(String a) {
			super(1);
		System.out.println("constructor chaining with string parameter ");
		}
}
	class ConstructorMain {
		public static void main(String[] args) {
			Constructor a1 = new Constructor("ashok");
		}
	}

