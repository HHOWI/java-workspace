package com.placetube.impl;

import com.placetube.model.Comment;

public interface CommentImpl {

	public void addComment(String id, String password, Comment comment);

	public Comment viewComment(int index);

	public void updateComment(int index, Comment comment);

	public void deleteComment(int index);
	
}
