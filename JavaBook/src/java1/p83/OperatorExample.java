package java1.p83;

public class OperatorExample {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0;	//문자열 형태로 변환되어 int 값으로 산출되지 않고, string으로 산출된다.
		String str6 =  3 + 3.0 +"JDK";	//int값이 먼저 산출된 후 문자열 형태로 변환된다.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
	}

}
