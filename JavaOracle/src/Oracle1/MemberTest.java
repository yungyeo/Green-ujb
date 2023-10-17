package Oracle1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		System.out.print("Input ename...?");
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		System.out.println(inp);
		sc.close();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list(inp);
		
		for(int i = 0; i<list.size(); i++) {
			MemberVO data = (MemberVO) list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();
			int comm = data.getComm();
			
			System.out.printf("%6s : %8s : %6d : %6d\n" , empno,ename,sal,comm);
		}
	}
}
