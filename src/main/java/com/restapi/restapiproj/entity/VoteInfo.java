package com.restapi.restapiproj.entity;

import java.util.Objects;

public class VoteInfo {
	
	private long candidateId;
	private String candidateName;
	private int candidateAge;
	private int voteCount;
	
	public VoteInfo(long candidateId, String candidateName, int candidateAge, int voteCount) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.candidateAge = candidateAge;
		this.voteCount = voteCount;
	}

	public long getVoterId() {
		return candidateId;
	}

	public void setVoterId(long candidateId) {
		this.candidateId = candidateId;
	}

	public String getVoterName() {
		return candidateName;
	}

	public void setVoterName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getVoterAge() {
		return candidateAge;
	}

	public void setVoterAge(int candidateAge) {
		this.candidateAge = candidateAge;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidateId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoteInfo other = (VoteInfo) obj;
		return candidateId == other.candidateId;
	}

	@Override
	public String toString() {
		return "VoteInfo [candidateId=" + candidateId + ", candidateName=" + candidateName + ", candidateAge=" + candidateAge + ", voteCount="
				+ voteCount + "]";
	}
	
	

}
