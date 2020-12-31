package databaseconfigure;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
public class DBCongigure {
	
		public static ArrayList<String> getDataTable(String SQLQuery, String result)
				throws ClassNotFoundException, SQLException {
			// Configure
			Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC location
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Execute Query
			ResultSet rs = stmt.executeQuery("select * from Employees;");

			// Read the data from db
			ArrayList<String> columnValue = new ArrayList<>();
			while (rs.next()) {
				columnValue.add(rs.getString(result));
			}
			System.out.println(columnValue);
			connection.close();

			return columnValue;

		}

	}

