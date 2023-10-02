package java3.p49;

public abstract class Animal {	//abstract 추상 메소드를 사용하면 클래스도 추상으로 만들어줘야한다.
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉼니다.");
	}
	
	public abstract void sound();
}
