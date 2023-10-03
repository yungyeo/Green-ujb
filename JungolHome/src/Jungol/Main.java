package Jungol;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dou1 = sc.nextDouble();
		double dou2 = sc.nextDouble();
		String sr = sc.next();
		sc.close();
		
		System.out.printf("%.2f\n%.2f\n", dou1, dou2);
		System.out.println(sr);
	}
}
