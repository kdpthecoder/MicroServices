package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTransformController {

	@RequestMapping(method=RequestMethod.GET, value = "/transform/{source}/{table}")
	public String transform(@PathVariable String source, @PathVariable String table) {
		return "Data Transformed for Source: "+source+", Table: "+table;
	}
}
