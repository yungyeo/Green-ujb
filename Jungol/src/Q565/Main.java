package Q565;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10];

		for (int i = 0; i < 100; i++) {
			int inp = sc.nextInt();

			if (inp == 0)
				break;
			else 
                count[(inp / 10) %10]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println(i + " : " + count[i]);
		}
		
		sc.close();

//		오답 코드(런타임 에러)
//		Scanner sc = new Scanner(System.in);
//		int[] sceond = new int[10];
//		int[] count = new int[10];
//
//		for (int i = 0; i < 100; i++) {
//			int inp = sc.nextInt();
//
//			if (inp == 0)
//				break;
//			else {
//				sceond[i] = inp / 10;
//				count[(sceond[i] % 10)]++;
//			}
//		}
//
//		for (int i = 0; i < count.length; i++) {
//			if (count[i] != 0)
//				System.out.println(i + " : " + count[i]);
//		}
	}
}
