package com.mt.week1.assign1;
import java.util.Scanner;

/**
 * Author: Muhammad Tanvir
 * Date: 09/23/2026
 * Description: The primary driver class for Assignment 1. 
 * Utilizes a Scanner to handle user keyboard inputs,
 * instantiates utility class objects,
 * and handles sequential execution for Tasks A through D.
 */


public class Main {
    public static void main(String[] args) {
        // Instantiate the scanner utility for keyboard input
        Scanner inputScanner = new Scanner(System.in);
        
        // Assignment constraint verification: Instantiating objects from individual classes
        GradeCalculator gradeCalcObj = new GradeCalculator();
        DistanceConverter distanceConvObj = new DistanceConverter();
        VolumeConverter volumeConvObj = new VolumeConverter();
        CurrencyConverter currencyConvObj = new CurrencyConverter();

        System.out.println("Assignment 1");

        // Task A Execution: Grades
        System.out.print("\n[Task A] Enter Grade: ");
        double gradeInput = inputScanner.nextDouble();
        char finalGrade = gradeCalcObj.calculateGrade(gradeInput);
        System.out.println("Final Grade: " + finalGrade);

        // Task B Execution: Distance
        System.out.print("\n[Task B] Enter distance in Miles: ");
        double milesInput = inputScanner.nextDouble();
        double kmOutput = distanceConvObj.milesToKilometers(milesInput);
        System.out.printf("Distance in Kilometers is: %.2f km\n", kmOutput);

        // Task C Execution: Volume
        System.out.print("\n[Task C] Enter volume in Liters: ");
        double litersInput = inputScanner.nextDouble();
        double gallonsOutput = volumeConvObj.litersToGallons(litersInput);
        System.out.printf("Volume in Gallons: %.4f gal\n", gallonsOutput);

        // Task D Execution: Currency (CAD to USD)
        System.out.print("\n[Task D] Enter currency amount in CAD: ");
        double cadInput = inputScanner.nextDouble();
        double usdOutput = currencyConvObj.convertCadToUsd(cadInput);
        System.out.printf("Converted Amount: $%.2f USD \n", usdOutput);
        
        // Close scanner reference to prevent system leaks
        inputScanner.close();
    }
}
