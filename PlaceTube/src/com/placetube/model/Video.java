package com.placetube.model;

import java.util.Date;

public class Video {

	public String title;
	public String comment;
	public Date uploadAt;
	public int viewCount;
	public int likeCount;
	public String imgUrl;
	public String fileUrl;
	
	/*
	 * Create : 추가
	 * Read : 읽기(1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	public Video upload() { // 영상 업로드
		return null;
	}
	
	public Video videoList() { // 영상 목록
		return null;
	}
	
	public Video viewVideo() { // 영상 1개 보기
		return null;
	}
	
	public Video updateVideo() { // 동영상 수정
		return null;
	}
	
	public boolean delelteVideo() { // 동영상 삭제
		return false;
	}
}
