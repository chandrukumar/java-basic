package com.rr.oops.inherit;

public class MainClass {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
		
		Child child = new Child();
		child.method3();
		child.method1();
		child.method2();
		
		Parent parent2 = new Child();
		parent2.method1();
		parent2.method2();
		
		//Child child2 = new Parent();
	}
}
