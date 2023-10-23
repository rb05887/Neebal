package test;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit number: ");
		int number = sc.nextInt();
		if (number >= 1000 && number <= 9999) {
			int firstHalf = number / 100;
			int secondHalf = number % 100;
			// Swapping the halves
			int swappedNumber = (secondHalf * 100) + firstHalf;

			
			System.out.println("Swapped Number is : " + swappedNumber);
		} else {
			System.out.println("Please enter a valid 4-digit number.");
		}
	}
}
