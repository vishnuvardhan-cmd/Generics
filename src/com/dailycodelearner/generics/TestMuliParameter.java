package com.dailycodelearner.generics;

public class TestMuliParameter {
	
	public <T,K> void mix(T obj,K obj1) {
		System.out.println(obj+" "+obj1);
	}
}
