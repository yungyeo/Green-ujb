import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleSelect {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM EMP";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%5s", rs.getString("empno"));
				System.out.printf("%8s", rs.getString("ename"));
				System.out.printf("%10s", rs.getString("job"));
				System.out.printf("%6d", rs.getInt("mgr"));
				System.out.printf("%14s", rs.getDate("hiredate"));
				System.out.printf("%6d", rs.getInt("sal"));
				System.out.printf("%5d", rs.getInt("comm"));
				System.out.printf("%5d\n", rs.getInt("deptno"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);

		}

	}
}
