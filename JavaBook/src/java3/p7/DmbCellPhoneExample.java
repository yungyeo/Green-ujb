package java3.p7;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("model : " + dmbCellPhone.medel);
		System.out.println("color : " + dmbCellPhone.color);
		
		System.out.println("channel : " + dmbCellPhone.channel);
		
		System.out.println();
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요. 홍길동 입니다.");
		dmbCellPhone.sendVoice("네, 반갑습니다.");
		dmbCellPhone.hangUp();
		
		System.out.println();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
