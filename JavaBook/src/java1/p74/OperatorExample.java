package java1.p74;

public class OperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		double result6 = (double) v1 / v2;	//(double)은 형변환이다. 타입캐스팅 (double) 변환 후 5.0/2가되어 계산이 된다. 앞에만 (double) 붙어 있기 때문이다.
		System.out.println("result6: " + result6);
	}

}
