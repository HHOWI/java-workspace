package com.placetube.impl;

import com.placetube.model.Video;

public interface VideoControllerImpl {

	public Video upload();

	public Video[] videoList();

	public Video viewVideo();

	public Video updateVideo();

	public boolean delelteVideo();
	
}
