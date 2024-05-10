package Q159;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] inp = new Integer[n];

		if (n <= 20) {
			for (int i = 0; i < n; i++) {
				inp[i] = sc.nextInt();
			}
		}

		sc.close();

		Arrays.sort(inp, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.print(inp[i] + "\n");
		}
	}
}
