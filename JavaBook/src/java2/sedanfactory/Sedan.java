package java2.sedanfactory;

import java2.conponent.Tire;

public class Sedan {
	public static void main(String[] args) {
//		java2.conponent.Tire compoTire = new java2.conponent.Tire();
		Tire compoTire = new Tire();
//		compoTire.size = 20;
		compoTire.setSize(20);
		
		//case2
		compoTire.setDoubleSize();	//객체값 자체를 변경해서 추출함.
		
//		System.out.println(compoTire.size);
		System.out.println(compoTire.getSize());
		
		//case1
		System.out.println(compoTire.getBigSize());	//객체값을 그대로 출력한 후 값을 변경하여 추출함.
	}

}
