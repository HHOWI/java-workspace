package com.youtube;

import com.youtube.controller.CommentController;
import com.youtube.model.Comment;

public class Application {

	public static void main(String[] args) {

		// 테스트하는 공간
		CommentController cc = new CommentController();
		
		cc.addComment("test1234", "1234", new Comment());
		
	}

}
