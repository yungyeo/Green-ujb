package Q9074;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10;
		int max = 1; 
		int cont = 0, cnt = 0;
		
		for(;;) {
			int inp = sc.nextInt();
			
			if(inp <= 0 || inp >= 11) {
				break;
			}
			
		}
		System.out.println(min + " : " + cont + "개");
		System.out.println(max + " : " + cnt + "개");
		sc.close();
	}
}
