package com.contribute.india.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.contribute.india.api.dto.CreateEventRequest;
import com.contribute.india.model.EventDetail;
import com.contribute.india.service.EventService;

@Service
public class EventServiceImpl implements EventService{

	@Override
	public Long createEvent(CreateEventRequest request) {
		EventDetail detail = new EventDetail();
		Long eventId = 123456L; //generate and event id
		
		detail.setEventId(eventId);
		detail.setCreatedOn(new Date());
		
		detail.setName(request.getName());
		detail.setDescription(request.getDescription());
		detail.setInitiator(""); //from the session fetch the current user and set the  email_id or user_id
		detail.setOrganizedOn(request.getOrganizedOn());
		
		//write detail in db
		System.out.println("Event created successfully. "+detail);
		
		return eventId;
	}

}
