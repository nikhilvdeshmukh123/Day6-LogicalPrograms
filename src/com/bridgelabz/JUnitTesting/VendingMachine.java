package com.bridgelabz.JUnitTesting;
import java.util.Scanner;

/*
 * @author Nikhil
 a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
returned by Vending Machine. Write a Program to calculate the minimum number
of Notes as well as the Notes to be returned by the Vending Machine as a
Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
to get to the minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
change and second list of Rs Notes that would given in the Change.
 */
public class VendingMachine {

	static int change(int n) {
		int[] list = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		if (n == 0) {
			return 0;
		}
		int multiplier = 0;
		for (int element : list) {
			if (n >= element) {
				multiplier = n / element;
				n = n - multiplier * element;
				for (int i = 0; i < multiplier; i++) {
					System.out.printf("%d ", element);
				}
				break;
			}
		}
		return multiplier + change(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount for change :");
		int n = scan.nextInt();

		System.out.println("No of notes : " + change(n));
	}
}