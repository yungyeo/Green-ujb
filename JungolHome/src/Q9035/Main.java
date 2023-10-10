package Q9035;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력하세요. ");
		int[] inp = new int[3];
		int max = 0;
		
		for(int i=0; i<inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		
		if(inp[0] > inp[1] && inp[0] > inp[2]) {
			max = inp[0];
		}else if(inp[1] > inp[0] && inp[1] > inp[2]) {
			max = inp[1];
		}else {
			max = inp[2];
		}
		System.out.println("입력받은 수중 가장 큰 수는 " + max + "입니다.");
		sc.close();
	}
}
