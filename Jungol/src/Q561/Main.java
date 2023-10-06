package Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int max = inp[0];
		int min = 1000;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] < 100 && inp[i] > max) {
				max = inp[i];
			}else {
				if(min == 1000 && inp[i] > 100 && inp[i] < min) {
					min = 100;
					min = inp[i];
				}
			}
		}

		System.out.print(max + " ");
		System.out.print(min);

		sc.close();
	}
}
