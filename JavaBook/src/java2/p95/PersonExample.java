package java2.p95;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "KyeBaek");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/*
		p1.nation = "USA";
//		The final field cannot be assigned.
		p1.ssn = "6545321-7654321";
		p1.name = "LeeSoonsin";
		*/
		
	}
}
