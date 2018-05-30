package edu.edgewood.ProjectRough.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.edgewood.ProjectRough.model.User;

public class UserJdbcDao extends BaseJdbcDao {
	
	public User get(String id, String pwd) throws Exception{
		String sql = "select * from user_tbl where id = ? and pwd = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pwd);
			rs = stmt.executeQuery();
			if (rs.next()){
				return createUser(rs);
			}
			return null;
		}finally {
			releaseResources(conn, stmt, rs);
		}
	}

	private User createUser(ResultSet rs) throws Exception {
		String id = rs.getString("id");
		String pwd = rs.getString("pwd");
		String fname = rs.getString("first_name");
		String lname = rs.getString("last_name");
		
		return new User(id,pwd,fname,lname);
		
	}
}
