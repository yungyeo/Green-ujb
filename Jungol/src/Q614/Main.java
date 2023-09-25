package Q614;

import java.util.Scanner;

public class Main {
	String name;
	String school;
	int grade;
	
	Main(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	Main(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Main stu2 = new Main("Jejuelementary", "School", 6);
		System.out.println(stu2.grade + " grade in " + stu2.name + " " + stu2.school);
		
		System.out.println(grade + " grade in " + school + " School");
		
		Main stu1 = new Main(school, grade);
		stu1.print();
	}
}
