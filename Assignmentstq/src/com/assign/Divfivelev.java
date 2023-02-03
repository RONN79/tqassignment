package com.assign;
import java.util.Scanner;

public class Divfivelev
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check whether divisible by 5 and 11");
		int num = sc.nextInt();
		

		if((num % 5 == 0) && (num % 11 == 0))
		{
			System.out.println("\n Given number " + num + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + num + " is Not Divisible by 5 and 11"); 
		}	
		sc.close();
	}
}