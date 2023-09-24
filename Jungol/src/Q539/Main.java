package Q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, cnt = 0;
		float avg = 0f;
		
		for( ; ; ) {
		int inp = sc.nextInt();
//		System.out.print(inp + " ");
		sum += inp;
		cnt++;
		avg = (float)sum / cnt ;
	
		if (inp >= 100) {
			break;
		}
		}
		sc.close();
		
		System.out.println(sum);
		System.out.print(String.format("%.1f\n", avg));
	}
}
