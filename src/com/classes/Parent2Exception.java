package com.classes;

import java.util.Scanner;

public class Parent2Exception 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter First Number : ");
			int a = sc.nextInt();
			System.out.print("Enter Second Number : ");
			int b = sc.nextInt();
			
			int c = a/b;
			System.out.println("Divide is : "+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide By Zero ..");
		}
		
		catch (Exception e) 
		{
			System.out.println("Error Occured..");
		}
		
		finally 
		{
			sc.close();
			System.out.println("Exception HAndled ");
		}
	}
}
