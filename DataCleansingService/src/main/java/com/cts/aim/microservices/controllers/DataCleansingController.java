package com.cts.aim.microservices.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataCleansingController {

	@RequestMapping(method=RequestMethod.GET, value="/clean/{source}/{table}")
	public String clean(@PathVariable String source,@PathVariable String table) {

		return "File Cleansed for Source:"+source+ ", Table: "+table;
	}
}
