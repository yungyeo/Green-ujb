package Q9037;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요. ");
		int inp = sc.nextInt();
		sc.close();

		if (inp >= 90) {
			System.out.println("A");
		} else if (inp >= 80 && inp < 90) {
			System.out.println("B");
		} else if (inp >= 70 && inp < 80) {
			System.out.println("C");
		} else if (inp >= 60 && inp < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
