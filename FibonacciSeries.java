package com.LogicalProgramming;

public class FibonacciSeries {
	static void Fibonacci(int N) {
		int num1 = 0, num2 = 1;
		int counter = 0;
		while (counter < N)
		{
			System.out.println(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}
	public static void main(String args[])
	{
		int N =20;
		Fibonacci(N);
	}

}
