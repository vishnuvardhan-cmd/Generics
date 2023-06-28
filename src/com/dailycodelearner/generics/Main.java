package com.dailycodelearner.generics;

import java.util.*;

public class Main<T> {

	private T liquid;

	public static class Juice {

	}

	public static class Ragimalt {

	}

	public static class Water {

	}

	public static void main(String[] args) {

		Main<Juice> m = new Main<Juice>();
		m.liquid=new Juice();
		Main<Ragimalt> ragimalt = new Main<Ragimalt>();
		ragimalt.liquid=new Ragimalt();
		Main<Water> water = new Main<Water>();
		water.liquid=new Water();
		
		Integer[] a = { 1, 2, 34 };
		Boolean[] b = { true, false };
		ClassGeneric<Integer> classGeneric = new ClassGeneric<Integer>(a);
		ClassGeneric<Boolean> bClassGeneric = new ClassGeneric<Boolean>(b);
		classGeneric.getObj();
		bClassGeneric.getObj();
	}

//	@Override
//	public <Employee> Employee prepareObject(Employee data) {
//		// TODO Auto-generated method stub
//		Employee emp=new Employee();
//		emp.
//		return null;
//	}

}