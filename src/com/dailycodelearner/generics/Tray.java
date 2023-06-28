package com.dailycodelearner.generics;

public class Tray {

	/*
	 * unbounded genreics we can use subtype or type of the class
	 * to pass as an object
	 */
	public static void main(String[] args) {
		
		Tray t=new Tray();
		t.add(new Glass<OrangeJuice>());
	}

	public void add(Glass<? extends Juice> glass) {
		
	}
}
