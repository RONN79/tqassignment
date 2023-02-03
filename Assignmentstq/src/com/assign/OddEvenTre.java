package com.assign;
import java.util.Scanner;

public class OddEvenTre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter a number 2");
		int num2 = sc.nextInt();
		
	    int greater = (num1>num2) ? num1:num2;
	    System.out.println("Greater number is : " +greater);
		sc.close();
	}
}
