package com.classes;

public class AgeException 
{

	public static void checkAge(int age)
	{
		if(age < 18)
		{
			throw new IllegalArgumentException("Age Must Be 18 or Above..");
		}
		System.out.println("Age is Valid....");
	}
	
	public static void verifyAge(int age) throws Exception
	{
		checkAge(age);
		
		System.out.println("Age Verification Successfull");
	}
	
	public static void main(String[] args) 
	{
		try
		{
			verifyAge(10);
		}
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}

	}

}
