package Q9074;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp;
		int[] cnt = new int[11];

		for (int i = 0; i < 100; i++) {
			inp = sc.nextInt();
			if (inp == 0)
				break;
			else
				cnt[(inp)]++;

		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.println(i + " : " + cnt[i] + "개");
			}
		}
		sc.close();

//		Scanner sc = new Scanner(System.in);
//
//        List<Integer> inp = new ArrayList<>();
//        int[] cnt = new int[11];
//
//        while (true) {
//            int num = sc.nextInt();
//            if (num == 0) {
//                break;
//            }
//            inp.add(num);
//            cnt[num]++;
//        }
//
//        for (int i = 0; i < cnt.length; i++) {
//            if (cnt[i] != 0) {
//                System.out.println(i + " : " + cnt[i] + "개");
//            }
//        }
//        sc.close();
	}
}
