package Q614;

import java.util.Scanner;

public class Main {
	//case 2 (선생님 코드)
	
	private String school;
	private int grade;
	
	public void setVar(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
	
	
	
	/*
	//case 1 (내 코드)
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
	*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		//case 2 (선생님 코드)
		
		Main s1 = new Main();
		Main s2 = new Main();
		
		s1.setVar("Jejuelementary", 6);
		s2.setVar(school, grade);
		
		s1.print();
		s2.print();
		
		
		/*
		//case 1(내 코드)
		Main stu1 = new Main(school, grade);
		System.out.println(grade + " grade in " + school + " School");
		
		Main stu2 = new Main("Jejuelementary", "School", 6);
		System.out.println(stu2.grade + " grade in " + stu2.name + " " + stu2.school);
				
		stu1.print();
		stu2.print();
		*/
	}
}
