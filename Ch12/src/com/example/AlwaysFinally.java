package com.example;
class FourException extends Exception{}

public class AlwaysFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering first try block");
		try {
			System.out.println("Entering second try block");
			try {
				throw new FourException();
			}finally {
				System.out.println("finally in 2nd try block");
			}
		}catch(FourException e){
			System.out.println("Caught FourException in 1st try block");
		}finally {
			System.out.println("finally in 1st try block");
		}
	}

}
