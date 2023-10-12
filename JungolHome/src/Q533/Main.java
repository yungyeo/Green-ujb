package Q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

		if (str.equals("M")) {
			if (inp >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if (str.equals("F")) {
			if (inp >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}
