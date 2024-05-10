package Q158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[100];
		int cnt = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] == 0) {
				break;
			} else {
				cnt++;
			}

		}
		System.out.println(cnt);
		sc.close();

		for (int i = 0; i < cnt; i++) {
			if (inp[i] % 2 == 0) {
				inp[i] /= 2;
				System.out.print(inp[i] + " ");
			} else {
				inp[i] *= 2;
				System.out.print(inp[i] + " ");
			}
		}
	}
}