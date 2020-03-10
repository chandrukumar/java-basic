package com.rr.oops.poly;


public class MainClass {
public static void main(String[] args) {
	
	RunTimePolyDemoParent parent = new RunTimePolyDemoParent();
	parent.method1();
	parent.method2();
	RunTimePolyDemoParent parent2 = new RunTimePolyDemoChild();
	parent2.method1();
	parent2.method2();
}
}
