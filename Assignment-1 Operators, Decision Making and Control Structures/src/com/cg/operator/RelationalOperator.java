package com.cg.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a= s.nextInt();
		System.out.println("Enter second integer: ");
		int b= s.nextInt();
		boolean result= a>b;
		System.out.println("Result is: " +result);
		s.close();

	}

}
