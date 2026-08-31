package com.classes;

import java.util.Scanner;

public class CheckException 
{
	@SuppressWarnings("null")
	public static void check(int choice) throws ArithmeticException , NullPointerException , ArrayIndexOutOfBoundsException
	{
		if(choice == 1)
		{
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}
		else if(choice == 2)
		{
			int[] arr = {10,20,30,40,50};
			System.out.println(arr[8]);
		}
		else if(choice == 3)
		{
			String name = null;
			System.out.println(name.length());
		}
		else
		{
			System.out.println("No Exception Occured");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter Choice : ");
			int ch = sc.nextInt();
			
			check(ch);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("===============================================================");
			e.printStackTrace();
			System.out.println("===============================================================");
			System.out.println("This is ArithmeticException..");
			System.out.println("===============================================================");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("===============================================================");
			e.printStackTrace();
			System.out.println("===============================================================");
			System.out.println("This is ArrayIndexOutOfBoundsException..");
			System.out.println("===============================================================");
		}
		catch(NullPointerException e)
		{
			System.out.println("===============================================================");
			e.printStackTrace();
			System.out.println("===============================================================");
			System.out.println("This is NullPointerException..");
			System.out.println("===============================================================");
		}
		finally
		{
			sc.close();
		}

	}

}
