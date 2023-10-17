package OracleAwtLogin;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main extends WindowAdapter implements ActionListener {
	private Button login,register;
	private TextField id, pwd, check;
	private Frame f;
	private Label lid, lpwd, checked;
	private MemberDAO dao;
	private Frame mainFrame, Register;

	public Main() {
		dao = new MemberDAO();
		f = new Frame("Login");
		f.setSize(430, 150);
		f.setLayout(null);

		mainFrame = new Frame("MAIN");
		mainFrame.setSize(400, 300);
		mainFrame.setLocation(10, 20);
		mainFrame.setVisible(false);
		
		Register = new Frame("Register");
		Register.setSize(400, 300);
		Register.setLocation(10, 20);
		Register.setVisible(false);

		lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(20, 20, 50, 50);
		lpwd = new Label("PW : ", Label.RIGHT);
		lpwd.setBounds(20, 50, 50, 50);
		checked = new Label("Check : ");
		checked.setBounds(20, 80, 50, 50);

		login = new Button("Login");
		login.setBounds(300, 30, 65, 55);
		
		register = new Button("Register");
		register.setBounds(300, 90, 65, 30);

		id = new TextField(10);
		id.setBounds(80, 36, 200, 20);
		pwd = new TextField(10);
		pwd.setBounds(80, 66, 200, 20);
		pwd.setEchoChar('*');

		check = new TextField(30);
		check.setBounds(80, 95, 200, 20);

		login.addActionListener(this);
		register.addActionListener(this);
		f.addWindowListener(this);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(checked);
		f.add(check);
		f.add(login);
		f.add(register);
		f.setVisible(true);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				mainFrame.dispose();
			}
		});
		
		Register.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Register.dispose();
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Login")) {
		System.out.println("Login Click!");
		System.out.println("ID - " + id.getText());
		System.out.println("PW - " + pwd.getText());}
		else if(e.getActionCommand().equals("Register")) {
			System.out.println("Register Click!");	
			Register.setVisible(true);
			f.setVisible(false);
		}

		/*
		if (!id.getText().equals("") && !pwd.getText().equals("")) {
			ArrayList<MemberVO> ar = dao.list(id.getText());
			if (ar.size() != 0 && ar.get(0).getPwd().equals(pwd.getText())) {
				check.setText("로그인에 성공하였습니다. ");
				mainFrame.setVisible(true);
				f.setVisible(false);
			} else {
				check.setText("로그인에 실패하였습니다. ");
			}
		} else {
			check.setText("틀렸습니다. ");
		}
		*/
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		// Main tft = new Main();
		new Main();
	}
}
