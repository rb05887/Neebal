package test;

import java.util.Scanner;

public class TimeFormat7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 digit number: ");
		int mt = sc.nextInt();
		int hours = mt / 100;
		int minutes = mt % 100;
		String period = "AM";
		if (hours >= 12) {
			period = "PM";
			if (hours > 12) {
				hours -= 12;
			}
		}
		String formattedTime = String.format("%02d:%02d%s", hours, minutes, period);
		System.out.println("12-hour time format: " + formattedTime);
	}
}
