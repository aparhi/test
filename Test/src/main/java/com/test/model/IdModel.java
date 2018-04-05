package com.test.model;

public class IdModel {

	@Override
	public String toString() {
		return "IdModel [serviceNowID=" + serviceNowID + ", consumerID=" + consumerID + "]";
	}
	public String getServiceNowID() {
		return serviceNowID;
	}
	public void setServiceNowID(String serviceNowID) {
		this.serviceNowID = serviceNowID;
	}
	public String getConsumerID() {
		return consumerID;
	}
	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}
	private String serviceNowID;
	private String consumerID;

}
