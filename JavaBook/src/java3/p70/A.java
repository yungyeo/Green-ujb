package java3.p70;

public class A {
	class B{
		B(){}	//생성자
		int field1;	//--- 인스턴스필드
		static int field2;	//--- 정적 필드(x)
		
		void method1() {	//--- 인스턴스 메소드
			System.out.println("class B - method1()");
		}
		static void method2() {	//--- 정적 메소드(x)
			System.out.println("class B - method2()");
		}	
	}
}
