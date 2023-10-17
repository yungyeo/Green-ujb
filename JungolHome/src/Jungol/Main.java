package Jungol;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 91.44;
		
		System.out.print("yard? ");
		double b = sc.nextDouble();
		double sum = a * b;
		sc.close();
		
		System.out.print(b  + "yard = ");
		System.out.printf("%.1fcm", sum);
	}
}
