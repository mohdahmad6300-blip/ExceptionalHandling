package com.classes;

public class ThrowsNumber 
{

	    static void checkNumber(int number) throws Exception {

	        if (number < 0) {

	            throw new Exception("Number cannot be negative");
	        }

	        System.out.println("Number is valid: " + number);
	    }


	    public static void main(String[] args) {

	        try {

	            checkNumber(-10);

	        } catch (Exception e) {

	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	
}
