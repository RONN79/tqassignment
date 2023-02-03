package com.assign;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result;
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Enter any operator from +,-,*,/%= ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1%num2;
			break;
		default:
			System.out.println("You have entered uncorrect operator.");
			return;
		}
			System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, result);
		
			
		}
	

	}


