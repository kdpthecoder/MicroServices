package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DQAController {

	@RequestMapping(method=RequestMethod.GET, value = "/analyze/{source}/{table}")
	public String analyze(@PathVariable String source, @PathVariable String table) {
		return "Data Quality Analysis for Source: "+source+", Table: "+table+" Complete!";
	}
}
