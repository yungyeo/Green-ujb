package java4.p38;

public class Main {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123    ";
		String tel3 = "   4 5 6 7    ";
		
		System.out.println(tel1+tel2+tel3);
		System.out.println(tel1.trim()+tel2.trim()+tel3.trim());
	}
}
