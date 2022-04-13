package com.bridgelabz.LogicalProgram;
import java.util.Scanner;
/*
 * @author Nikhil
 * 
 *  Program for reverse numbers
 * We need to calculate the remainder of the number using the modulo
 * After that, we need to multiply the variable reverse by 10 and add the remainder into
 * We then divide the number by 10 and repeat steps until the number becomes 0.
 * */
public class StopWatch {
    static double start = 0;
    static double stop = 0;

    static void startTime() {
        start = System.currentTimeMillis();
        System.out.println("Start Time = " + start);
    }

    static void stopTime() {
        stop = System.currentTimeMillis();
        System.out.println("Stop Time = " + stop);
    }

    static void elapsedTime() {
    	//Calculating the Seconds to be lapsed by starting and ending time
        System.out.println("Elapsed Time = " + (stop - start) / 1000 +" seconds");
    }

    public static void main(String[] args) {
    	 //Scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any key to start");
        input.next();
        startTime();
        System.out.println("Enter any key to stop");
        input.next();
        stopTime();
        elapsedTime();
    }
}