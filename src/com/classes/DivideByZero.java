package com.classes;
import java.util.Scanner;

public class DivideByZero 
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
		
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot Divide By Zero ..");
		}
		
		finally 
		{
			sc.close();
			System.out.println("Scanner Closed");
		}
	}
}
