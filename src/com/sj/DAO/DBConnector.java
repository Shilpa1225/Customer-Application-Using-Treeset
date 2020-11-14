/**
 * 
 */
package com.sj.DAO;

/**
 * @author skamsani2
 *
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBConnector {
	
		static DBConnector db;
		public   DBConnector() {
			
		}
		public  DBConnector getInstance() throws ClassNotFoundException{
			if(db==null)
				db=new DBConnector();
			return db;
			
		}
		
		public static Connection getConnection()throws SQLException{
			return (DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone1","root","shilpa1234@"));
			
	}

}




