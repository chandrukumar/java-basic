package com.rr.oops.poly;

public class CompileTimePolyDemo {

	
	public static void main(String[] args) {
		CompileTimePolyDemo compileTimePolyDemo = new CompileTimePolyDemo();
		compileTimePolyDemo.add(10, 20);
		compileTimePolyDemo.add(10, 20,30);
	}
	
	
	private void add(int a ,int b){
		int c = a+b;
		System.out.println(c);
	}
	
	private void add(int a,int b,int c){
		int d = a+b+c;
		System.out.println(d);
		
	}
}
