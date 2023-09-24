package java1.p75;

public class OperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);	//산출 타입 : int
//		char c3 = (c2 + 1);	//int타입으로 변환되어 산출될 수 없다. 그래서 (char) 선언을 해주어야한다.
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		System.out.printf("c2 : %d\n",(int)c2);	//%d (int)정수형 값으로 출력할 때 사용
		System.out.printf("c2 : %c\n",c2);		//%c char 값으로 출력할 때 사용
	}

}
