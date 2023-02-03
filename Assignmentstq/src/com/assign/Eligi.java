package com.assign;
import java.util.Scanner;
public class Eligi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks");
		float marks = sc.nextInt();
		System.out.println("Enter marks of three subjects");
		float bestThree = sc.nextInt();
		
		System.out.println((marks>85)||(bestThree>90)?"Eligible in college":"Not eligible in college");
	}

}
