/**
 * 
 */
package com.sj.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sj.model.Project;

//import sun.tools.java.ClassNotFound;

/**
 * @author skamsani2
 *
 */
public class ProjectDAO {
	
	Connection con;
	public boolean insertProject(Project p) throws ClassNotFoundException
	{
		try {
			con=DBConnector.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into Project values(?,?,?,?)");
		
		pst.setInt(1, p.getId());
		pst.setString(2,p.getTitle());
		pst.setString(3,p.getDescription());
		pst.setString(4, p.getDomain());
		pst.execute();
		return true;
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;		
		
	
	
	}	
	
	
}	
	
	
	
	
	


