/**
 * 
 */
package com.edensia.jasper.sample;

/**
 * @author geral
 *
 */
public class Garantie {
	String title;
	String description;
	
	/**
	 * @param title
	 * @param description
	 */
	public Garantie(String title, String description) {
		super();
		this.title = title;
		this.description = description;
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
