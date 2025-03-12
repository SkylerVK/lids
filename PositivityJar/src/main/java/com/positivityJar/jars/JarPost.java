package com.positivityJar.jars;

import java.util.ArrayList;

public class JarPost{

	public String title;
	public String content;
	public Long OP; // original poster
	public ArrayList<JarComment> comments;
	
	public void makePost(String title, String content, Long OP, ArrayList<JarComment> comments) {
		this.title = title;
		this.content = content;
		this.OP = OP;
		this.comments = comments;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
	public void setOP(Long OP) {
		this.OP = OP;
	}
	public Long getOP() {
		return OP;
	}
	
	// again, dont see reason for a whole setter. so i'll also include something to just add a comment
	public void setComments(ArrayList<JarComment> comments) {
		this.comments = comments;
	}
	public ArrayList<JarComment> getComments() {
		return comments;
	}
	// add comments
	public void addComment(JarComment comment) {
		comments.add(comment);
	}
}
