package test;

import java.util.Scanner;

public class BusService4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of bookings: ");
		int y = sc.nextInt();
		int people = 50 * (y / 50);
		System.out.println("People travelling= " + people);
	}

}
