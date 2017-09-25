package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataFormatController {

	@RequestMapping(method=RequestMethod.GET,value ="/format/{source}/{table}")
	public String standardizeFormat(@PathVariable String source,@PathVariable String table) {
		return "Format Satndardized for Source: "+source +", Table: "+table;
	}
}
