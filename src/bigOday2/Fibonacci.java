package bigOday2;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of n(th) fibonacci number : ");

		int n = sc.nextInt();
		int fibo = fibo(n);
		System.out.println("The value of " + n + "(th) fibo number is : " + fibo);
	}

	public static int fibo(int number) {
		if (number <= 1) {
			return 1;
		}
		int fibo0 = 1, fibo1 = 1, fibo = 1;

		for (int i = 2; i <= number; i++) {
			fibo = fibo0 + fibo1;

			fibo1 = fibo0;
			fibo0 = fibo;
		}
		return fibo;
	}

}
// Time complexity: O(n)

