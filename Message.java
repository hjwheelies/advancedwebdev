package edu.edgewood.ProjectRough.model;

public class Message {
	
	
		private String title;
		private String shortTitle;
		private String message;
		private String user;
		private String userUpdated;
		private String date;
		
		public Message(String title, String shortTitle, String message, String user, String userUpdated, String date){
			this.title=title;
			this.shortTitle=shortTitle;
			this.message=message;
			this.user=user;
			this.userUpdated=userUpdated;
			this.date=date;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getShortTitle() {
			return shortTitle;
		}

		public void setShortTitle(String shortTitle) {
			this.shortTitle = shortTitle;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUserUpdated() {
			return userUpdated;
		}

		public void setUserUpdated(String userUpdated) {
			this.userUpdated = userUpdated;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

}
