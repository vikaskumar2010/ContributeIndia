package com.contribute.india.api.dto;

public class CreateEventResponse {
	private boolean success;
	private Long eventId;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "CreateEventResponse [success=" + success + ", eventId=" + eventId + "]";
	}

}
