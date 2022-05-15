package com.bridgelabz.JUnitTesting;
import java.util.Scanner;
/*
 * @author Nikhil
 *Write Binary.java to read an integer as an Input, convert to Binary using toBinary
function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.
 */
public class Binary {
	static void toBinary(int n) {
		if (n == 0) {
			return;
		}
		int remainder = n % 2;
		n = n / 2;
		toBinary(n);
		System.out.printf("%d", remainder);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		toBinary(a);
	}
}