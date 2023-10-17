package Q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[100];
		
		for(int i=0; i<=inp.length; i--) {
			inp[i] = sc.nextInt();
			
			if(inp[i] == 0) {
				break;
			}
			System.out.println(inp[i]);
		}
	}
}
