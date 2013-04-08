package com.jndi;

public class GitConnection {
	
	private String gitLocation;
	
	public GitConnection() {
		
	}
	
	/**
	 * This method gets the Git Location.
	 * @return the Git Location.
	 */
	public String getGitLocation() {
		return gitLocation;
	}

	/**
	 * This method sets the Git Location.
	 * @param gitLocation the git location.
	 */
	public void setGitLocation(String gitLocation) {
		this.gitLocation = gitLocation;
	}
}