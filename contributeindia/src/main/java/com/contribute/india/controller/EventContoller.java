package com.contribute.india.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contribute.india.api.dto.CreateEventRequest;

@RestController
public class EventContoller {
	

	@RequestMapping(value="/events/{id}" ,method=RequestMethod.GET)
	public String getEventDetail(@PathVariable("id") String eventId){
		return "It must return detail of event (id="+eventId+")";
	}
	@RequestMapping(value="/events" ,method=RequestMethod.GET)
	public String getAllEventList(@RequestParam("start") String start,@RequestParam("rows") String rows){
		return "It must return list of all the event with pagination supported. start:"+start+" rows:"+rows;
	}
	@RequestMapping(value="/events" ,method=RequestMethod.POST)
	public String createEvent(@RequestBody CreateEventRequest request){
		return "It must create an event with provided detail: "+request.getTitle();
	}
}
