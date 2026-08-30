package com.classes;

import java.util.Scanner;

public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Coice :-->\n1.NumberFormatException\n2.ArrayIndexOutOfBoundsException\n3.ArithmeticException\n4.NullPointerException\nEnter Choice :");
		int choice = sc.nextInt();
		
		try
		{
		if(choice == 1)
		{
			
				String num = "ABC";
				int number = Integer.parseInt(num);
				System.out.println("Number is : "+number);
			
		}
		else if(choice == 2)
		{
			
			
				int[] array = {10,20,30,40,50};
				System.out.println(array[6]);
			
		}
		else if(choice == 3)
		{
			
				System.out.print("Enter First Number : ");
				int a = sc.nextInt();
				System.out.print("Enter Second Number : ");
				int b = sc.nextInt();
				int c = a/b;
				System.out.println("Divide is : "+c);
			
		}
	
		else if(choice == 4)
		{
			String name = null;
			System.out.println("Lenght : "+name.length()); 
		}
		else
		{
			System.out.println("Invalid Input..");
		}
		}
		
		catch (NumberFormatException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			String num = "ABC";
			System.out.println("This is NumberFormatException.\nCannot Convert "+num+" into an Interger.");
			System.out.println("======================================================================");
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			System.out.println("This is Array Out of Index Exception...");
			System.out.println("======================================================================");
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot Divide By Zero ..");
		}
		
		catch(NullPointerException e) 
		{
			System.out.println("======================================================================");
			e.printStackTrace();
			System.out.println("======================================================================");
			System.out.println("This is NullPointerException..");
			System.out.println("======================================================================");
		}
		
		finally 
		{
			sc.close();
			System.out.println("Program Continues..");
		}
	}
}
