package com.contribute.india.api.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
@JsonSerialize
public class CreateEventRequest {

	private String name;
	private String description;
	private Date organizedOn;

	public CreateEventRequest() {
		super();
	}

	public CreateEventRequest(String title, String description, Date organizedOn) {
		super();
		this.name = title;
		this.description = description;
		this.organizedOn = organizedOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getOrganizedOn() {
		return organizedOn;
	}

	public void setOrganizedOn(Date organizedOn) {
		this.organizedOn = organizedOn;
	}

	@Override
	public String toString() {
		return "CreateEventRequest [title=" + name + ", description=" + description + ", organizedOn=" + organizedOn
				+ "]";
	}

}
