package com.ndevendran.hobby.message.board.model;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

import com.ndevendran.hobby.identity.User;

public class TopicTest {
	String testTitle = "testTitle";
	String testUsername = "testUser";
	String testContent = "test Content";
	Topic testTopic = new Topic(testTitle);
	User testUser = new User(testUsername);
	
	@Test
	public void testICanAddPost() {
		UUID postId = testTopic.addPost(new Post(testContent, testUser));
		String returnedContent = testTopic.getPost(postId).getContent();
		String returnedUsername = testTopic.getPost(postId).getPosterName();
		assertEquals(testContent, returnedContent);
		assertEquals(testUsername, returnedUsername);		
	}
	
	@Test
	public void testTitleIsCorrect() {
		assertEquals(testTitle, testTopic.getTitle());
	}

}
