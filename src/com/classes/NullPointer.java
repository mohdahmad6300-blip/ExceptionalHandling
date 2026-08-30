package com.classes;

public class NullPointer 
{

	public static void main(String[] args) 
	{
		String name = null;
	
		try 
		{
			
			System.out.println("Lenght : "+name.length()); 
		}
		catch(NullPointerException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			System.out.println("This is NullPointerException..");
			System.out.println("======================================================================");
		}
	}

}
