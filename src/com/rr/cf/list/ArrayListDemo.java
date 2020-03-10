package com.rr.cf.list;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ramesh");
		al.add("Ganesh");
		al.add("Ramesh");
		
		for(int i =0; i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		Vector vec = new Vector();
		vec.add("Ramesh");
		vec.add("Ganesh");
		vec.add("Ramesh");
		
		for(int i =0; i<vec.size();i++){
			System.out.println(vec.get(i));
		}
	}
}
