package Q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		char[] ar = new char[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();
		
//		ar[0] = sc.next().charAt(0);
//		ar[1] = sc.next().charAt(0);
//		ar[2] = sc.next().charAt(0);
//		ar[3] = sc.next().charAt(0);
//		ar[4] = sc.next().charAt(0);
//		ar[5] = sc.next().charAt(0);
//		ar[6] = sc.next().charAt(0);
//		ar[7] = sc.next().charAt(0);
//		ar[8] = sc.next().charAt(0);
//		ar[9] = sc.next().charAt(0);

		String out = "";
		for (int i = 0; i <= 9; i++) {
			out += ar[i];
		}

		System.out.print(out);
	}
}
