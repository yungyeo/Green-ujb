package Q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//case4
		int[] inp = new int[3];
		for(int i=0; i <inp.length;i++) {
			inp[i] = sc.nextInt();
		}
		
		//case1, 2, 3
		//int inp1 = sc.nextInt();
		//int inp2 = sc.nextInt();
		//int inp3 = sc.nextInt();
		sc.close();
		
		//int min;
		
		//case1
		/*
		min = (inp1 < inp2) ? inp1:inp2;
		min = (min < inp3) ? min:inp3;
		*/
	
		//case2
		//min = (inp1 < inp2)?((inp1<inp3)?inp1:inp3) : ((inp2<inp3)?inp2:inp3);
		
		//case3
		//min = (inp[0] < inp[1] && inp[0] < inp[2])? inp[0]:(inp[1]<inp[2])?inp[1]:inp[2];
		
		
		//case1, 2, 3
		//System.out.print(min);
		
		//case4
		if(inp[0] > inp[1] ) {
			if(inp[1] > inp[2]) {
				System.out.println(inp[2]);
			}else {
				System.out.println(inp[1]);
			}
		}else {
			if(inp[0] > inp[2]) {
				System.out.println(inp[2]);
			}else {
				System.out.println(inp[0]);
			}
		}
	}
}
