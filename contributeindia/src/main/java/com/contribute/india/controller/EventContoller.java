package com.contribute.india.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contribute.india.api.dto.CreateEventRequest;
import com.contribute.india.api.dto.CreateEventResponse;
import com.contribute.india.service.EventService;

@RestController
public class EventContoller {

	@Autowired
	private EventService eventService;

	@RequestMapping(value="/events/{id}" ,method=RequestMethod.GET)
	public String getEventDetail(@PathVariable("id") String eventId){
		return "It must return detail of event (id="+eventId+")";
	}
	@RequestMapping(value="/events" ,method=RequestMethod.GET)
	public String getAllEventList(@RequestParam("start") String start,@RequestParam("rows") String rows){
		return "It must return list of all the event with pagination supported. start:"+start+" rows:"+rows;
	}
	@RequestMapping(value="/events" ,method=RequestMethod.POST)
	public ResponseEntity<CreateEventResponse> createEvent(@RequestBody CreateEventRequest request){
		CreateEventResponse response = new CreateEventResponse();
		Long id = eventService.createEvent(request);
		response.setEventId(id);
		if(id != null)
			response.setSuccess(true);
		else
			response.setSuccess(false);
		
		return new ResponseEntity<CreateEventResponse>(response,HttpStatus.OK);
		
	}
}
