package com.ndevendran.hobby.message.board.model;
import static org.junit.Assert.*;

import org.junit.Test;

import com.ndevendran.hobby.identity.User;
import com.ndevendran.hobby.message.board.model.Post;


public class PostTest {
	String testContent = "This is the test content";
	User testUser = new User("testUser");
	Post testPost = new Post(testContent, testUser);
	
	@Test
	public void testCreatePostWithContent() {
		String actualContent = testPost.getContent();
		assertEquals(testContent, actualContent);
	}
	
	@Test
	public void testCreatePostWithUser() {
		assertEquals(testUser.getUsername(), testPost.getPosterName());
	}

}
