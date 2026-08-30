package com.classes;

public class ArrayException 
{
	public static void main(String[] args) 
	{
		int[] array = {10,20,30,40,50};
		
		try 
		{
			System.out.println(array[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			System.out.println("This is Array Out of Index Exception...");
			System.out.println("======================================================================");
		}
		finally 
		{
			System.out.println("Program Ended..");
		}
		
	}
}
