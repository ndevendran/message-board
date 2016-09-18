package com.ndevendran.hobby.message.board.model;
import java.util.UUID;

import com.ndevendran.hobby.identity.User;


public class Post {
	private String content;
	private User user;
	private UUID postId;
	
	public Post(String content, User user) {
		this.content = content;
		this.user = user;
		this.postId = UUID.randomUUID();
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getPosterName() {
		return user.getUsername();
	}
	
	public UUID getPostId() {
		return this.postId;
	}
}
