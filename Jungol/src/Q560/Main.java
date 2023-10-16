package Q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int min = 1000;
		
		for(int i=0; i<inp.length;i++) {
			inp[i] = sc.nextInt();
			
			if(inp[i] < min) {
				min = inp[i];
			}
		}
		System.out.print(min);
		sc.close();
	}
}
