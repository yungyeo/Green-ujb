package Ball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int[] inp = new int[3];
		int[] input = new int[3];
		int strike, ball;

		for (int i = 0; i < input.length; i++) {
			input[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					i--;
					break;
				}
			}
		}

		for (int inp1 : input) {
			System.out.print(inp1 + " ");
		}

		while (true) {
			System.out.print("\n" + "Input number...");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (inp[i] == inp[j]) {
						i--;
						break;
					}
				}
			}

			strike = 0;
			ball = 0;

			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < inp.length; j++) {

					if (input[i] == inp[j] && i == j) {
						strike++;
					} else if (input[i] == inp[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println("\n" + "strike : " + strike + ", ball : " + ball);
			if (strike == 3) {
				System.out.println("Game Over");
				break;
			}
		}
		sc.close();
		*/
	}
}
