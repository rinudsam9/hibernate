import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemo {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT code, name FROM product");
			
			 rs.absolute(3); // moves the cursor to the fifth row of rs
		       rs.updateString("NAME", "AINSWORTH"); // updates the
		          // NAME column of row 5 to be AINSWORTH
		       rs.updateRow(); // updates the row in the data source
		       
		       rs.moveToInsertRow(); // moves cursor to the insert row
		     // updates the
		          // first column of the insert row to be AINSWORTH
		       rs.updateInt(1,50); 
		       // updates the second column to be 35
		       rs.updateString(2, "percy");
		       rs.updateDouble(3, 3000); // updates the third column to true
		       rs.insertRow();
		       rs.moveToCurrentRow();
		} catch (Exception e) {
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
