package com.assign;
import java.util.Scanner;
public class SwitchMonthsDays 
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month 1 to 12: ");
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("31 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 Days");
		break;
		case 2:System.out.println("Enter the year:");
				int year = sc.nextInt();
				if((year%400==0)||((year%4==0)&&(year%100!=0)))
				{
					System.out.println("29 Days");
				}
				else
					System.out.println("28 Days");
		default: System.out.println("Error");
		}
		sc.close();
	}
}