package com.dailycodelearner.generics;

public class Glass2<T extends Juice & Liquid> {
	
	private T data;
	
	public void setObj(T obj) {
		this.data=obj;
	}
	
	public void getObj() {
		data.Taste();
	}

}
