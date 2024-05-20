package Q9114;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			char inp = sc.next().charAt(0);

			if (inp >= 'a' && inp <= 'z') {
				System.out.println("소문자입니다.");
			}else if(inp >= 'A' && inp <= 'Z') {
				System.out.println("대문자입니다.");
			}else if(inp >= 48 && inp <= 57) {
				System.out.println("숫자문자입니다.");
			}else {
				System.out.println("영문, 숫자 이외의 문자입니다.");
				break;
			}
		}
		sc.close();
	}
}
