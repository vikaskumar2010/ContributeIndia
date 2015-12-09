package com.contribute.india.service;

import com.contribute.india.api.dto.CreateEventRequest;

public interface EventService {
	Long createEvent(CreateEventRequest request);
}
