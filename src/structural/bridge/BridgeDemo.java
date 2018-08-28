package structural.bridge;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BridgeDemo {

	public static void main(String[] args) {
		/*
		 * Adapter works with legacy code and the bridge works with new code.
		 * 
		 * Level of indirection that gives us flexibility.
		 * 
		 * changes in abstraction wont affect client.
		 * 
		 * Examples: Drivers, JDBC
		 */
		// Here we are using an derby embedded driver
		// The driver should implement a specific interface so that the drivermanager
		// so the driver manager can work with every driver which implements the interface.
//		DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
//
//		String dbUrl = "some connection String";
//		
//		Connection connection = DriverManager.getConnection(dbUrl);
//		
//		Statement statement = connection.createStatement();
		
//		Statement.executeUpdate("some SQL code");
		/*
		 * We can swap the database but the client will stay the same...so with the same API,
		 * DriverManager will "bridge" the DB to the client (we) and will allow us to work in the same 
		 * way with all those databases...isn't that great!?
		 */
	}

}
