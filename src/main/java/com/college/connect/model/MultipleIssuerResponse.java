package com.college.connect.model;

import java.util.List;

import com.college.connect.model.Issuer;

public class MultipleIssuerResponse {
	private boolean success;
	private List<Issuer> issuers;

	public MultipleIssuerResponse(boolean success, List<Issuer> issuers) {
		this.success = success;
		this.issuers = issuers;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<Issuer> getIssuers() {
		return issuers;
	}

	public void setIssuers(List<Issuer> issuers) {
		this.issuers = issuers;
	}
}