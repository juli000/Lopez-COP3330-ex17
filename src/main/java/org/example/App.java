/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is your age?" );
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        Integer age = Integer.valueOf(a);
        System.out.println("You are " + (age >= 16 ? "" : "not ") + "old enough to legally drive.");
    }
}
