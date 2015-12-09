package com.contribute.india.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.contribute.india.enums.EventStatus;

public class EventDetail {
	private Long eventId;
	private String name;
	private String description;
	private Date createdOn;
	private Date organizedOn;
	private String initiator;
	private List<String> contributers = new ArrayList<String>();
	private int likeCount = 0;
	private EventStatus status;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
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

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getOrganizedOn() {
		return organizedOn;
	}

	public void setOrganizedOn(Date organizedOn) {
		this.organizedOn = organizedOn;
	}

	public String getInitiator() {
		return initiator;
	}

	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}

	public List<String> getContributers() {
		return contributers;
	}

	public void setContributers(List<String> contributers) {
		this.contributers = contributers;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public EventStatus getStatus() {
		return status;
	}

	public void setStatus(EventStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EventDetail [eventId=" + eventId + ", name=" + name + ", description=" + description + ", createdOn="
				+ createdOn + ", organizedOn=" + organizedOn + ", initiator=" + initiator + ", contributers="
				+ contributers + ", likeCount=" + likeCount + ", status=" + status + "]";
	}

}
