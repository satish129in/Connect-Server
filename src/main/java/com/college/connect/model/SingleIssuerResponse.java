package com.college.connect.model;

import com.college.connect.model.Issuer;

public class SingleIssuerResponse {
	private boolean success;
	private Issuer issuer;

	public SingleIssuerResponse(boolean success, Issuer issuer) {
		this.success = success;
		this.issuer = issuer;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Issuer getIssuers() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}
}