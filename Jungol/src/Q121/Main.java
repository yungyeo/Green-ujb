package Q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		if(inp == 0) {
			System.out.println("zero");
		}else if(inp > 0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
	}
}
