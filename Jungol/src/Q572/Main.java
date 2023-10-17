package Q572;

import java.util.Scanner;

public class Main {
	//case1 -------------------------------------- (단, 일반적이지 않음. case3 혹은 case2가 일반적인 코드임)
	Scanner sc = new Scanner(System.in);
	int inp = sc.nextInt();
	double sum = 0;
	double dou = 3.14;

	void run() {
		sum = inp * inp * dou;
		System.out.printf("%.2f", sum);
		return;
	}
	
	//case3 ------------------------------------
	/*
	public Main() {
		sc = new Scanner(System.in);
		inp = sc.nextInt();
		sum = 0;
		dou = 3.14;
	}
	
	public void run() {
		sum = inp * inp * dou;
		System.out.printf("%.2f", sum);
	}
	*/
	
	// case2 ------------------------------------
	/*
	public double static double circle(int r) {
		double area = r * r * 3.14;
		return area;
	}
	*/
	 
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
		
		//case 2 -----------------------------------
		/*
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		System.out.println(r);
		double d = circle(r);
		System.out.printf("%.2f\n", d);
		*/
	}
}
