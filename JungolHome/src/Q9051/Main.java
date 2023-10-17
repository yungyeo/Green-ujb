package Q9051;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for(int i=0; i <= inp.length; i++) {
			inp[i] = sc.nextInt();
			System.out.print(inp + " ");
		}
		sc.close();
	}

}
 