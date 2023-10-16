package java6.p40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	private Button btn1;
	private TextField id, pwd, check;
	private String M_ID = "greencom", M_PWD = "green1234";
	private Frame f;
	private Label lid, lpwd, checked;

	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(430, 150);
		f.setLayout(null);

		lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		lpwd = new Label("PW : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);
		checked = new Label("Check : ");
		checked.setBounds(20, 80, 50, 50);

		btn1 = new Button("Login");
		btn1.setBounds(300, 33, 65, 80);

		id = new TextField(10);
		id.setBounds(80, 36, 200, 20);
		pwd = new TextField(10);
		pwd.setBounds(80, 66, 200, 20);
		pwd.setEchoChar('*');

		check = new TextField(30);
		check.setBounds(80, 95, 200, 20);

		btn1.addActionListener(this);
		f.addWindowListener(this);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(checked);
		f.add(check);
		f.add(btn1);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Login Click!");
		System.out.println("ID - " + id.getText());
		System.out.println("PW - " + pwd.getText());
		System.out.println();

		if (id.getText().equals(M_ID) && pwd.getText().equals(M_PWD)) {
			check.setText("로그인에 성공하였습니다. ");
		} else {
			check.setText("로그인에 실패하였습니다. ");
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest();
	}
}
