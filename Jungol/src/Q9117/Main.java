package Q9117;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		sc.close();

		String rotate = inp;

		do {
			rotate = rotate.substring(1) + rotate.charAt(0);
			System.out.println(rotate);
		} while (!rotate.equals(inp));

//		'rotated에 inp 값을 복사하여 사용하는 이유는 원본 문자열을 보존하기 위함입니다. 
//		만약에 rotated를 따로 선언하지 않고 inp를 직접 조작하게 되면, 회전된 문자열과 원본 문자열이 항상 같아지는 순간을 정확히 예측하기가 어려울 수 있습니다. 
//		따라서 rotated를 따로 선언하여 회전된 문자열을 관리함으로써 원본 문자열을 보존하고 명확하게 비교할 수 있습니다.
	}
}
