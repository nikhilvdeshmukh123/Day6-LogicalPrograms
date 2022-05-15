package com.bridgelabz.LogicalProgram;

import java.util.Scanner;
/* 
 * @author: Nikhil
 * 
 * Program for fibonacci series
 * Fibonacci series is a special type of series in which the next term is the sum of the
 * previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
 * the next term will be 1(0+1).
 * */
public class FibonacciSeries {
	public static void fibonacciSeries(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number");
		int num = sc.nextInt();
		fibonacciSeries(num);
	}
}