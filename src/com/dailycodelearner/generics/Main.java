package com.dailycodelearner.generics;

import java.util.*;

public class Main<T> {

	public static void main(String[] args) {

		TestMuliParameter test = new TestMuliParameter();
		test.<Integer, String>mix(15, "sharuku");

	}

}