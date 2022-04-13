package com.bridgelabz.LogicalProgram;
import java.util.Scanner;
/*
 * @author Nikhil
 * a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
 * the start and end clicks
 * b. I/P -> Start the Stopwatch and End the Stopwatch
 * c. Logic -> Measure the elapsed time between start and end
 * d. O/P -> Print the elapsed time.
 */
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