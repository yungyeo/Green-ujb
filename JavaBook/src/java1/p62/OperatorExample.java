package java1.p62;

public class OperatorExample {
	public static void main(String[] args) {
		short s = 100;
		short s2 = 32767;  //-32,768 ~ 32767만 허용 가능한 값범위 초과되면 컴파일 에러 뜸.
//		short result1 = -s;  // 처음 선언을 short으로 했고, 허용 가능한 범위였더라도 -연산자가 추가되면 무조건 int 타입으로 변환되어 에러가 발생한다.
		int result2 = s;
		
		System.out.println(s);
		System.out.println(result2);
	}

}
