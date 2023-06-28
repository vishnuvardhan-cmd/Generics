package com.dailycodelearner.generics;

public class TestMuliParameter<T, u> {

	T obj;
	u obj1;
	void setObj(T obj, u uObj) {
		this.obj=obj;
		this.obj1=uObj;
	}
	
	T getObj() {
		return obj;
	}
	
	u getObj1() {
		return obj1;
	}
}
