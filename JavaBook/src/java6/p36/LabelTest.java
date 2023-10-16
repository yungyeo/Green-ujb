package java6.p36;

import java.awt.Frame;
import java.awt.Label;

public class LabelTest {
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);

		Label id = new Label("ID : ");
		id.setBounds(50, 50, 30, 10); // 50, 50위치에 30, 10 크기로

		Label pwd = new Label("PassWord : ");
		pwd.setSize(100, 10);
		pwd.setLocation(50, 65);
		
		f.add(id);
		f.add(pwd);
		f.setVisible(true);
	}
}
