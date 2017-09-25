package com.cts.aim.microservices.job;

import javax.persistence.Entity;


@Entity
public class Job {

	int jobid;
	String jobname;
	int jobStage;
	String jobStatus;
	
	
}
