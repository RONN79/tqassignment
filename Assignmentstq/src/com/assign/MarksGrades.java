package com.assign;
import java.util.Scanner; 

public class MarksGrades {

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter marks of five subjects");
	  System.out.println("Enter marks of English");
	  float english = sc.nextFloat();
	  System.out.println("Enter marks of Marathi");
	  float marathi = sc.nextFloat();
	  System.out.println("Enter marks of Hindi");
	  float hindi = sc.nextFloat();
	  System.out.println("Enter marks of Science");
	  float science = sc.nextFloat();
	  System.out.println("Enter marks of History");
	  float history = sc.nextFloat();
	  
	  float total = english+marathi+hindi+science+history;
	  System.out.println("Total: "+total);
	  float percentage = (total/500)*100;
	  System.out.println("Percentage: "+percentage);
	  
	  if(percentage >85);
	  
		  System.out.println("Excellent");
	  
	}

}
