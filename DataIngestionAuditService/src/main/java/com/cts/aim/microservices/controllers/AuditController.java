package com.cts.aim.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.aim.microservices.services.AuditService;

@RestController
public class AuditController {

	@Autowired
	private AuditService as;
	
	
	@RequestMapping(method=RequestMethod.GET, value = "/audit/job/{source}/{table}/{id}")
	public String getJob(@PathVariable String source,@PathVariable String table, @PathVariable String id) {
		return "Job for Source: "+source + ", Table: "+table +", ID: "+id;
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/audit/job/{source}/{table}")
	public String createJob(@PathVariable String source,@PathVariable String table) {
		return "Job created for Source: "+source + ", Table: "+table + "ID: "+10;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/audit/job/{source}/{table}/{id}")
	public String updateJob(@PathVariable String source,@PathVariable String table, @PathVariable String id) {
		return "Job updated for Source: "+source + ", Table: "+table+", ID: "+id;
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/audit/job/{source}/{table}/{id}")
	public String deleteJob(@PathVariable String source,@PathVariable String table, @PathVariable String id) {
		return "Job Deleted: Source: "+source + ", Table: "+table +" ID: "+id;
	}
	
}
