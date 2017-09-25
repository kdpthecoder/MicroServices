package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataPullController {

	@RequestMapping(method=RequestMethod.GET, value = "/pull/{source}/{table}")
	public String pull(@PathVariable String source,@PathVariable String table) {
		return "Data Pulled for Source: "+source + ", Table: "+table;
	}
}
