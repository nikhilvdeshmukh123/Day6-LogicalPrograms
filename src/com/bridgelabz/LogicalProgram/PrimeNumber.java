package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

/*
 * @author Nikhil
 *  
 *  program for prime numrs
 * When the number is divided greater than 1 and
 *  divided by 1 or itself is referred to as the Prime number.
 *  */
public class PrimeNumber {
	public static boolean primeNum(int num) {
		//Checking condition for Prime Number
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime Number");
				return false;
			}
		}
		System.out.println(num + " is a prime Number");
		return true;
	}

	public static void main(String[] args) {
		// Scanner Object for Taking Input from User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		primeNum(num);
	}

}