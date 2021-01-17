package com.ven.usermaintain.vo;

import java.io.File;

public class UserVo {
	
	private Long id;
	private File profileImage;
	private String username;
	
	public UserVo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the profileImage
	 */
	public File getProfileImage() {
		return profileImage;
	}

	/**
	 * @param profileImage the profileImage to set
	 */
	public void setProfileImage(File profileImage) {
		this.profileImage = profileImage;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	

}
