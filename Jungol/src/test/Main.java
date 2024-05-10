package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[100];
		int max, min;
		int save = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] == 999) {
				save = i;
				break;
			}
		}

		max = inp[0];
		min = inp[0];

		for (int i = 0; i < save; i++) {
			if (max < inp[i]) {
				max = inp[i];
			} else if (min > inp[i]) {
				min = inp[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}