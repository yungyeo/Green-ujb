package Oracle1;

public class MemberVO {
	private String empno;
	private String ename;
	private int sal;
	private int comm;
	
	public MemberVO() {
		
	}
	
	public MemberVO(String empno, String ename, int sal, int comm) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.comm = comm;
	}
	
	public String getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public int getSal() {
		return sal;
	}
	
	public int getComm() {
		return comm;
	}
}
