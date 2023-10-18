package Q615;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// case 1 ------------------------------------------------------------
		String stu1 = sc.next();
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();

		String stu2 = sc.next();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();

		int sum1 = score1 + score3;
		int sum2 = score2 + score4;
		
		System.out.println(stu1 + " " + score1 + " " + score2);
		System.out.println(stu2 + " " + score3 + " " + score4);
		System.out.println("avg " + (sum1 / 2) + " " + (sum2 / 2));

		Student m = new Student(stu1, stu2, score1, score2, score3, score4, sum1, sum2);
		m.print();
		sc.close();
		
		// case 2 ------------------------------------------------------------------------
		/*
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		
		Student stu1, stu2;
		
		for(int i=0;i<2;i++) {
			name[i] = sc.next();
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
		}
		
		stu1 = new Student(name[0], kor[0], eng[0]);
		stu2 = new Student(name[1], kor[1], eng[1]);
		
		stu1.print();
		stu2.print();
		
		int avgKor = (stu1.getKor() + stu2.getKor())/2;
		int avgEng = (stu1.getEng() + stu2.getEng())/2;
		System.out.println("avg " + avgKor + " " + avgEng);
		*/
	}

}

class Student {
	// case 1 ------------------------------------------------------------
	private String stu1, stu2;
	private int score1, score2, score3, score4;
	private int sum1, sum2;

	public Student(String stu1, String stu2, int score1, int score2, int score3, int score4, int sum1, int sum2) {
		this.stu1 = stu1;
 	this.stu2 = stu2;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
		this.sum1 = sum1;
		this.sum2 = sum2;
	}

	public void print() {
	}
	
	// case 2 -----------------------------------------------------------------------------------
	/*
	private String name;
	private int kor, eng;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	*/
}

