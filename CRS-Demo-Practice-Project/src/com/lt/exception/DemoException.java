package com.lt.exception;

public class DemoException {
	public static void main(String[] args) {
		try{int a=10,b=0,c;
		c=a/b;
		System.out.println(c);}
		catch(ArithmeticException ex){
			System.out.println("Wrong Manipulation"+ex.getMessage());
		}
	}
}
