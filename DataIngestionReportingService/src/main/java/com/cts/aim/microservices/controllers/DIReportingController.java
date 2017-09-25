package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DIReportingController {

	@RequestMapping(method=RequestMethod.GET, value = "/generateReport/{source}/{table}")
	public String generateReport(@PathVariable String source,@PathVariable String table) {
		return "Ingestion Report Generated for Source: "+source + ", Table: "+table;
	}
}
