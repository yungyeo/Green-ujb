package java3.p54;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);

		System.out.println();

		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);

		// ----------------------------------------------
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("RemoteControl - turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("RemoteControl - turnOff()");
			}

			@Override
			public void setVolume(int volume) {
			}

		};

		rc2.turnOn();
		rc2.turnOff();
	}

}
