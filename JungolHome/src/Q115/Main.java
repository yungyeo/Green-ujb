package Q115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[4];
		boolean b;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}

		if (inp[0] > inp[2] && inp[1] > inp[3]) {
			b = true;
		} else {
			b = false;
		}

		System.out.println(b);
		sc.close();
	}
}
