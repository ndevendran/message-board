package com.ndevendran.hobby.message.board.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Topic {
	List<Post> posts;
	private String title;
	private UUID topicId;
	
	public Topic(String title) {
		posts = new ArrayList<Post>();
		this.title = title;
		this.topicId = UUID.randomUUID();
	}
	
	public UUID addPost(Post post) {
		posts.add(post);
		return post.getPostId();
	}
	
	public Post getPost(UUID targetPostId) {
		Post currentPost = null;
		Post targetPost = null;
		for(int i = 0; i < posts.size(); i++) {
			currentPost = posts.get(i);
			if(currentPost.getPostId().equals(targetPostId)) {
				targetPost = currentPost;
				break;
			}
		}		
		return targetPost;
	}

	public String getTitle() {
		return this.title;
	}
}
