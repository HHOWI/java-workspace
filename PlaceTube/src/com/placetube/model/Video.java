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
	public Video() {
	}
	public Video(String title, String comment, Date uploadAt, int viewCount, int likeCount, String imgUrl,
			String fileUrl) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.viewCount = viewCount;
		this.likeCount = likeCount;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", viewCount=" + viewCount
				+ ", likeCount=" + likeCount + ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + "]";
	}
	
	
}
