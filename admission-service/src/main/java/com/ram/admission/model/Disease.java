package com.ram.admission.model;

public class Disease {

	private String id;
	private String discription;
	private String treatment;
	
	public Disease() {
		// TODO Auto-generated constructor stub
	}

	public Disease(String id, String discription, String treatment) {
		super();
		this.id = id;
		this.discription = discription;
		this.treatment = treatment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	
}
