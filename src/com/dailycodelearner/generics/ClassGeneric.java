package com.dailycodelearner.generics;

public class ClassGeneric<T> {

	private T[] data;
	
	public ClassGeneric(T[] input) {
		this.data=input;
	}
	
	public void getObj() {
		System.out.println(data.getClass());
		for(T t:data) {
			System.out.println(t);
		}
	}
	
	  
	
}
