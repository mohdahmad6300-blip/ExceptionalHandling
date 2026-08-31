package com.classes;

public class IllegalMarks 
{
	public static void checkMarks(int marks)
	{
		if(marks < 0 || marks > 100)
		{
			throw new IllegalArgumentException("Illegal Marks Input.");
		}
		System.out.println("Marks : "+marks);
	}

public static void main(String[] args) 
{
	try
	{
		checkMarks(-5);
	}
	catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
