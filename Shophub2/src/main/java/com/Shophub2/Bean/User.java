package com.Shophub2.Bean;

public class User {
	
		private long userId;
	    private String userName;
	    private String email;
	    private long contact;
	    private String password;
	    
		public User(long userId, String userName, String email, long contact,
				String password) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.email = email;
			this.contact = contact;
			this.password = password;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    
	    

}

