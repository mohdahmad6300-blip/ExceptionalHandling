package com.classes;

import java.util.Scanner;

public class ParentException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		try
		{
			int c = a/b;
			System.out.println("Divide is : "+c);
		}
		
		catch (Exception e) 
		{
			System.out.println("Cannot Divide By Zero ..");
		}
		
		finally 
		{
			sc.close();
			System.out.println("Exception HAndled Throw Parent Class");
		}
	}
}
