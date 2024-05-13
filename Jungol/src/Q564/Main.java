package Q564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] inp = new char[100];
		int[] cnt = new int[26];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next().charAt(0);
			if (inp[i] < 'A' || inp[i] > 'Z') {
				break;
			}
			cnt[inp[i] - 'A']++;
//			cnt[inp[i] - 65]++;
//			char를 사용하였기에 숫자와 알파벳, ASCII(숫자) 코드를 사용해도 가능하다.
		}

		for (int i = 0; i < 26; i++) {
			if (cnt[i] != 0)
				System.out.println((char) (i + 65) + " : " + cnt[i]);
		}
	}
}
