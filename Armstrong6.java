package test;

import java.util.Scanner;

public class Armstrong6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int p = 0;
		while (n > 0) {
			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}

		if (temp == p) {
			System.out.println(p+" is an Armstrong Number");
		} else {
			System.out.println(p+" is not an Armstrong");
		}

	}

}
