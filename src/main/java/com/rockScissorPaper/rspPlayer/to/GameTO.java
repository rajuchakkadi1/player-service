package com.rockScissorPaper.rspPlayer.to;

public class GameTO {

	public GameTO(String status, String userSign, String systemSign) {
		super();
		this.status = status;
		this.userSign = userSign;
		this.systemSign = systemSign;
	}

	private String status;
	private String userSign;
	private String systemSign;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserSign() {
		return userSign;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}

	public String getSystemSign() {
		return systemSign;
	}

	public void setSystemSign(String systemSign) {
		this.systemSign = systemSign;
	}

}
