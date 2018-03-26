package com.edensia.jasper.sample;

public class Garantie {

	String code;
	String title;
	String description;
	
	public Garantie() {
		
	}
	
	public Garantie(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
