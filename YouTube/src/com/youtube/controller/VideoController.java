package com.youtube.controller;

import java.util.ArrayList;

import com.youtube.model.Video;

public class VideoController{

	ArrayList<Video> videoList = new ArrayList<>();
	
	public void upload(Video video) {
		videoList.add(video);
	}

	public ArrayList<Video> videoList() { // 동영상 목록
		return videoList;
	}

	public Video viewVideo(int index) { // 동영상 1개 보기
		return videoList.get(index);
	}

	public void updateVideo(int index, Video video) {
		videoList.set(index, video);
	}

	public boolean deleteVideo(Video video) {
		return videoList.remove(video);
	}

	/*
	 * Create : 추가
	 * Read : 읽기(1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 */
	
	
}
