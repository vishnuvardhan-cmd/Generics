package com.dailycodelearner.generics;

import java.util.*;

/*
 * for bounded parameters we should use only extends keyword at class level for both
 * extending classes and interfaces
 */
public class Glass<T extends Liquid> {
	
	 private T data;
	 public Glass(T obj) {
		 this.data=obj;
	 }
	public static void main(String[] args) {
		Glass<Juice> glass=new Glass<Juice>(new Juice());
		glass.getTaste();
		Glass<Water> water=new Glass<Water>(new Water());
		water.getTaste();
//		Glass<CupCake> cupCake=new Glass<CupCake>(new CupCake());
//		cupCake.getTaste();
		/*
		 * this will not work because cupcake is not a bounded parameter
		 * why becuase it was not implementing liquid interface
		 */
//		
//		Glass2<WaterMelon> waterMelon=new Glass2<>();
//		waterMelon.setObj(new WaterMelon());
//		waterMelon.getObj();
		
	}
	
	public String getTaste() {
		return data.Taste();
	}
	
	/*
	 * Bounding at method level at method level we need use only classes or abstract
	 * classes for extending purpose interface can't be used
	 */
	
	public <U extends Juice> String getBoundedorNot( U obj){
		return obj.Taste();
	}

}