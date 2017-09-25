package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DQFController {

	@RequestMapping(method=RequestMethod.GET, value = "/filter/{source}/{table}")
	public String filter(@PathVariable String source, @PathVariable String table) {
		return "Data Filtered for Source: "+source+", Table: "+table;
	}
	
}
