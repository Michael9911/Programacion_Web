package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException { 
		// Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String Name = "hacker.net"; 
        String UserName = "admin"; 
        String Password = "toor"; 
        Class.forName(dbDriver); 
        Connection conexion = DriverManager.getConnection(dbURL + Name,UserName,Password); 
        return conexion;
	}
}
