package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

/* 
 *@author Nikhil 
 *
 * Program for perfect numrs
 * When the number is equal to the sum of its positive divisors
 * excluding the number, it is called a Perfect Number.
 * The divisors of 28 are 1, 2, 4, 7, and 14. So,
 * 28 = 1+2+4+7
 * 28 = 28
 */
public class PerfectNumber {
	public static void perfectNum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		if (sum == num) {
			System.out.println(num + " is Perfect Number");
		} else {
			System.out.println(num + " is not Perfect Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		perfectNum(num);
	}
}