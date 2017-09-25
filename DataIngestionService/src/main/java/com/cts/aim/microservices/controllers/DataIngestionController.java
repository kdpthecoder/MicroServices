package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataIngestionController {

	@RequestMapping(method=RequestMethod.GET, value = "/ingest/{source}/{table}")
	public String ingest(@PathVariable String source, @PathVariable String table) {
		return "Data Ingested for Source: "+source+", Table: "+table;
	}
}
