package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 7
 *  Copyright 2021 Steven Ortiz
 */

//What is the length of the room in feet? 15
//What is the width of the room in feet? 20
//You entered dimensions of 15 feet by 20 feet.
//The area is
//300 square feet
//27.871 square meters


import java.util.Scanner;

import java.text.DecimalFormat;

public class App {

    static Scanner in = new Scanner(System.in);

    private static double lengthint(){

        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        return Integer.parseInt(length);

    }

    private static double widthint(){

        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();
        return Integer.parseInt(width);

    }

    public static void main(String[] args) {

        double factor = (double) 0.09290304;

        double lengthint = lengthint();
        double widthint = widthint();

        System.out.println("You entered the dimensions of " + lengthint + " feet by " + widthint + " feet.");

        double areaImperial = lengthint * widthint;
        double areaMetric = areaImperial * factor;

        System.out.println("The area is");

        System.out.println(""+String.format("%.3f", areaImperial )+" square feet");

        System.out.print(""+String.format("%.3f",areaMetric)+ " square meters");
    }
}