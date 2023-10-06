package java5.p36;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {		//필수
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	
	public int hashCode() {			//필수
		return name.hashCode() + age;
	}
}
