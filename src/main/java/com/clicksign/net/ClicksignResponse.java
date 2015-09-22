package com.clicksign.net;

public class ClicksignResponse {
	int responseCode;
	String responseBody;

	public ClicksignResponse(int responseCode, String responseBody) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;

		System.out.println("ClicksignResponse(int responseCode, String responseBody)");
		System.out.println(this.responseBody);
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
}
