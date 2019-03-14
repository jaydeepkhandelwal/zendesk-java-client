package org.zendesk.client.v2.model;

import java.util.List;


public class CommentWithUsers {
	private List<Comment> comments;
	private List<User> users;

	public CommentWithUsers() {

	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
