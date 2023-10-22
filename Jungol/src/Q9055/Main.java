package Q9055;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 0; i < inp; i++) {
			if (sum == inp) {
				sum += i;
				break;
			}
		}
		System.out.println(sum);
	}
}
