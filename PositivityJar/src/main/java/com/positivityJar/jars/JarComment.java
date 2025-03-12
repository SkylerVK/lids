package com.positivityJar.jars;

public class JarComment {

	// name of the person who made the comment
	public String userName;
	// internal ID of the person who made the comment
	public Long userID;
	// the contents of the comment
	public String content;
	
	public void makeComment(String userName, Long userID, String content) {
		this.userName = userName;
		this.userID = userID;
		this.content = content;
	}
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
		
	}
	
	public Long getID() {
		return userID;
	}
	public void setID(Long userID) {
		this.userID = userID;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
