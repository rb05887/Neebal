package test;

import java.util.Scanner;

public class Years3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of days");
		int d = sc.nextInt();
		int yr = d / 365;
		d = d % 365;
		int mon = d / 30;
		d = d % 30;
		int w = d / 7;
		d = d % 7;
		int days = d;
		System.out.println(
				"Output: " + yr + " Years" + ": " + mon + " Months" + ": " + w + " Weeks" + ": " + d + " Days");

	}

}
