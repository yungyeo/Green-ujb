package Q9112;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();
		System.out.println("입력받은 문자열의 길이는 " + inp.length() + "입니다.");

		String reverse = "";
		for (int i = inp.length() - 1; i >= 0; i--) {
			reverse = reverse + inp.charAt(i);
		}
		System.out.print(reverse);
	}
}
