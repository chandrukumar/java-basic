package com.rr.cf.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add("Ramesh");
	set.add("Ganesh");
	set.add("Ramesh");
	
	Iterator iterator = set.iterator();
	
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
}
}
