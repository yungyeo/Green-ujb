package Q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		while (true) {
			int inp = sc.nextInt();

			if (inp % 3 != 0 && inp % 5 != 0) {
				cnt++;
			} else if (inp == 0) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
