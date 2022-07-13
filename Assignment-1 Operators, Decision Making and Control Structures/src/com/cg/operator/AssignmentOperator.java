package com.cg.operator;

import java.util.Scanner;

public class AssignmentOperator {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a= s.nextInt();
		System.out.print("Enter second integer: ");
		int b= s.nextInt();
		int result = (a*=b);
		System.out.println("Result is: " +result);
		s.close();
	}
}
