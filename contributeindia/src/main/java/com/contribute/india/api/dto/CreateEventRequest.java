package com.contribute.india.api.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
@JsonSerialize
public class CreateEventRequest {
	
	String title;
	String description;

	public CreateEventRequest() {
		super();
	}

	public CreateEventRequest(String title, String description) {
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

	@Override
	public String toString() {
		return "CreateEventRequest [title=" + title + ", description=" + description + "]";
	}

}
