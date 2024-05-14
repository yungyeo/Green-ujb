package Q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ASCII code =? ");
			int inp = sc.nextInt();
			char ch = (char) inp;

			if (inp < 33 || inp > 127) {
				break;
			}

			System.out.println(ch);
		}
		sc.close();
	}
}
