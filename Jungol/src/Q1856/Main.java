package Q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int sum = 1;
		
		//case1 -----------------------------------------------
		int arr[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {						//홀수번째 줄
				for (int j = 0; j < m; j++) {
					arr[i][j] = sum++;
				}
			} else {								//짝수번째 줄
				for (int j = m - 1; j >= 0; j--) {
					arr[i][j] = sum++;
				}
			}
		}
		
		/*
		아래와 같은 반복문으로도 가능
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
			}
		}
		*/

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//case2 -----------------------------------------------
		
	}
}
