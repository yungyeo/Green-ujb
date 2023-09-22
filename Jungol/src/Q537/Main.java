package Q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int i = 1;
		
		while(i <= inp) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}

}
