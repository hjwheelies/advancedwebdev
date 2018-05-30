package edu.edgewood.ProjectRough.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.edgewood.ProjectRough.model.Message;

public class MessageJdbcDao extends BaseJdbcDao {
	
	public Message get(String messageID) throws Exception{
		String sql = "select * from message where 'message id' = ? ";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, messageID);
			
			rs = stmt.executeQuery();
			if (rs.next()){
				return createMessage(rs);
			}
			return null;
		}finally {
			releaseResources(conn, stmt, rs);
		}
	}

	private Message createMessage(ResultSet rs) throws Exception {
		String id = rs.getString("message id");
		String title = rs.getString("title");
		String shortTitle = rs.getString("message");
		String createdBy = rs.getString("created by");
		String date = rs.getString("date");
		String userUpdated = rs.getString ("created by");
		
		return new Message(id,title,shortTitle,createdBy, date, userUpdated);
		
	}
}
