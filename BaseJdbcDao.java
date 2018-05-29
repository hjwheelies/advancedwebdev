package edu.edgewood.RCS417Project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseJdbcDao {
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/messageboard";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";

    /**
     * Returns a connection to the database.
     * @return Database connection
     * @throws SQLException
     */
    final protected Connection getConnection() throws SQLException
    {
        try
        {
            Connection myConnection;
            Class.forName(DRIVER_NAME);
            myConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return(myConnection);
        }
        catch(ClassNotFoundException cnfe)
        {
            throw new SQLException(cnfe);
        }
    }
    
    final protected void releaseResources(Connection conn, Statement stmnt, ResultSet rs){
    	if(rs != null){
    		try{
    			rs.close();
    		}catch (Exception ex){
    			ex.printStackTrace();
    		}
    	}
    	if(stmnt != null){
    		try{
    			rs.close();
    		}catch (Exception ex){
    			ex.printStackTrace();
    		}
    }
    	if(conn != null){
    		try{
    			rs.close();
    		}catch (Exception ex){
    			ex.printStackTrace();
    		}
    	}
    }

}
