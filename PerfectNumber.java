package com.LogicalProgramming;
import java.util.Scanner;
public class PerfectNumber{
	public static void main(String args[]) {
		int i,number,sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		number = scanner.nextInt();
		for(i = 1; i < number; i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == number) {
			System.out.format("\n %d is a Perfect Number", + number);
		}
		else {
			System.out.format("\n %d is not a Perfect Number",+ number);

		}
	}


}
