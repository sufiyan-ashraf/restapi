package com.restapi.restapiproj.entity;

public class CandidateInfo {
	
	private String candidateName;
	private int voteCount;
	
	public CandidateInfo(String candidateName, int voteCount) {
		super();
		this.candidateName = candidateName;
		this.voteCount = voteCount;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	
	

}
