package java4.p26;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("path");
		System.out.println("Path : " + javaHome);
	}
}
