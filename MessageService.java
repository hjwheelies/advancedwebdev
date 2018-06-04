package edu.edgewood.ProjectRough.service;
import java.sql.ResultSet;

import edu.edgewood.ProjectRough.dao.*;
import edu.edgewood.ProjectRough.model.Message;


public class MessageService {
	private MessageJdbcDao dao;
	
	public MessageService () {
		dao = new MessageJdbcDao();
		
	}
	
	public Message find (String messageID){
		try{
			return dao.get(messageID);
		}catch (Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

}
