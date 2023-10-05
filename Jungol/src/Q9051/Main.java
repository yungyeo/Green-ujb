package Q9051;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[10];
		int cnt = 0;
		
		for(int i=0; i<inp.length; i++) {
			inp[i] = sc.nextInt();
			
			if(inp[i] %2 ==0){
				cnt++;
			}
		}
		
		System.out.println("입력받은 짝수는 " + cnt + "개입니다.");
		sc.close();
	}
}
