package Q9115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);

			if (Character.isUpperCase(c)) {
				System.out.print(Character.toLowerCase(c));
			} else if(Character.isLowerCase(c)){
				System.out.print(Character.toUpperCase(c));
			}else {
				System.out.print(c);
			}
		}

		sc.close();
		
//		틀린 답안 print에서 isUpperCase로 호출하였음. toUpperCase로 해야 출력가능.
//		for (int i = 0; i < inp.length(); i++) {
//			char c = inp.charAt(i);
//
//			if (Character.isUpperCase(c)) {
//				System.out.print(Character.isLowerCase(c));
//			} else if(Character.isLowerCase(c)){
//				System.out.print(Character.isUpperCase(c));
//			}else {
//				System.out.print(c);
//			}
//		}
	}
}
