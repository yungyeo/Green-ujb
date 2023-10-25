package Q616;

import java.util.Scanner;

class Triangle {
	//private Point p1, p2, p3;
	private Point[] p;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		/*
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
		*/
		
		p = new Point[3];
		p[0] = new Point(x1, y1);
		p[1] = new Point(x2, y2);
		p[2] = new Point(x3, y3);
	}

	public void getCOG() {
		double dx = 0.0;
		double dy = 0.0;

		for (int i = 0; i < p.length; i++) {
			dx += p[i].getX();
			dy += p[i].getY();
		}
		System.out.printf("(%.1f, %.1f)", dx / p.length, dy / p.length);
	}
	
	/*
	public double getCOGX() {
		double dx = (p1.getX() + p2.getX() + p3.getX())/(double)3;
		return dx;
	}
	
	public double getCOGY() {
		double dy = (p1.getY() + p2.getY() + p3.getY())/(double)3;
		return dy;
	}
	
	public void getCOG() {
		System.out.printf("(%.1f, %.1f)", getCOGX(), getCOGY());
	}
	*/
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	/*
	private int x1, x2, x3, y1, y2, y3, sumx, sumy;
	
	public Main(int x1, int x2, int x3, int y1, int y2, int y3, int sumx, int sumy) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		
		this.sumx = sumx;
		this.sumy = sumy;
	}
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		
		/*
		int sumx = x1 + x2 + x3;
		int sumy = y1 + y2 + y3;
		
		System.out.printf("(%.1f, %.1f)", (double) sumx / 3, (double) sumy / 3);
		*/
		
		/*
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		
		System.out.printf("(%.1f, ", (p1.getX() + p2.getX() + p3.getX())/(double)3);
		System.out.printf("%.1f)", (p1.getY() + p2.getY() + p3.getY())/(double)3);
		*/
		
		Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
		tri.getCOG();
	}
}
