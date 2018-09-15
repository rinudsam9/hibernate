import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class ConnectionDemo {

	public static void main(String[] args) {
		//String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection conn = null;

		try {
			/*DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(url, "aayushi", "aayushi");*/
			conn=JdbcFactory.getConnection();
			System.out.println("connected successfully");

			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB name:" + meta.getDatabaseProductName());
			System.out.println("DB ver:" + meta.getDatabaseProductVersion());
			System.out.println("driver name:" + meta.getDriverName());
			System.out.println("driver ver:" + meta.getDriverVersion());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
