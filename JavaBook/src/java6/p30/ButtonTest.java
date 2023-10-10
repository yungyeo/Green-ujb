package java6.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.*;

public class ButtonTest extends WindowAdapter implements ActionListener {
	private Frame frame;
	private Button btn;

	public ButtonTest() {
		
		btn = new Button("확인");
		btn.setSize(100, 50);
		btn.setLocation(100, 75);
		btn.addActionListener(this);
		
		frame = new Frame("Login");
		frame.setLayout(null);
		frame.setSize(300, 200);
		frame.add(btn);
		frame.setVisible(true);
		frame.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed()");
		btn.setLabel("취소");
	}

	public static void main(String[] args) {
		ButtonTest f = new ButtonTest();
	}
}
