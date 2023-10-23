package test;

import java.util.Scanner;

public class MilliSecond1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long l = sc.nextLong();
		long hr = l / (60 * 60 * 1000);
		l = l % (60 * 60 * 1000);
		long min = l / (60 * 1000);
		l = l % (60 * 1000);
		long sec = l / 1000;
		System.out.println("Output: " + hr + ":" + min + ":" + sec);

	}

}
