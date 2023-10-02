package java3.p47;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone2 = new Phone("이성당");		추상클래스로 생성되었기에 객체생성이 불가하다.
		
//		Phone phone1 = new SmartPhone("홍길동");		Phone클래스는 추상이지만, SmartPhone은 기본 클래스이므로 객체생성은 가능하다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSerach();		//단, 레퍼런스를 Phone으로 가져오게 되면, 자식클래스에 선언한 메소드는 가지고 올 수 없다.
		smartPhone.turnOff();
	}

}
