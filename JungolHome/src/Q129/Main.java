package Q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Base = ");
			int base = sc.nextInt();

			System.out.print("Height = ");
			int height = sc.nextInt();

			System.out.printf("Triangle width = %.1f\n", (((double) base * height) / 2));

			System.out.print("Continue? ");
			String str = sc.next();

			if (str.equals("Y") || str.equals("y")) {
				
			}else {
				break;
			}
		}
		sc.close();
	}
}
