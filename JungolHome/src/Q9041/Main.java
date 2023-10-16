package Q9041;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("점수를 입력하세요. ");
			int inp = sc.nextInt();
			
			if(inp > 100 || inp < 0) {
				sc.close();
				break;
			} else if(inp >= 80 && inp <= 100) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		}

	}
}
