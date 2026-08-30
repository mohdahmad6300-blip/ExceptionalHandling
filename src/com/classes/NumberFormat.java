package com.classes;

public class NumberFormat 
{

	public static void main(String[] args)
	{
		String num = "ABC";
		
		try 
		{
			int number = Integer.parseInt(num);
			System.out.println("Number is : "+number);
		}
		
		catch (NumberFormatException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			System.out.println("This is NumberFormatException.\nCannot Convert "+num+" into an Interger.");
			System.out.println("======================================================================");
		}
		
		finally 
		{
			System.out.println("Program Continues..");
		}

	}

}
