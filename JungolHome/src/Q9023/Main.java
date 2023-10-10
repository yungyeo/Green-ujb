package Q9023;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		
		if (inp[0] != inp[1] || inp[1] != inp[2]) {
			System.out.print("0 ");
		} 
		if (inp[0] == inp[1] || inp[1] == inp[2]) {
			System.out.print("1 ");
		}

		if (inp[0] != inp[1] || inp[1] != inp[2]) {
			System.out.print("1 ");
		}
		if (inp[0] == inp[1] || inp[1] == inp[2]) {
			System.out.print("0");
		}
	}
}
