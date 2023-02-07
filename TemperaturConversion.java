package com.LogicalProgramming;
import java.util.Scanner;
public class TemperaturConversion {

	public static void main(String[] args) {
		// initialising
		/* double celsius = 10.0, fahrenheit = 0.0;
		         // formula for conversion
		        fahrenheit = (celsius * 1.8) + 32;
		        System.out.println(
		            " value of temperature in fahrenheit:"
		            + fahrenheit);*/
		double a,c,f=0;
		Scanner scanner = new Scanner(System.in);	   	 
		System.out.println("Enter  Fahrenheit temperature");
		a = scanner.nextDouble(); 
		System.out.println("Celsius temperature is = "+ f);	
		System.out.println("Enter  celsius temperature");
		f = scanner.nextDouble(); 
		System.out.println("  Fahrenheit temperature is = " + f);		 
	} 
	static double celsius(double f)
	{	
		return  (f-32)*5/9;
	}
	static double fahrenheit(double f) {
		double c = 0;
		return f = (c * 1.8) + 32;

	}
}
