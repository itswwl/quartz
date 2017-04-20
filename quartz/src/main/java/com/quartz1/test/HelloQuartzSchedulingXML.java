package com.quartz1.test;

import org.apache.el.parser.ParseException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class HelloQuartzSchedulingXML {
	public static void main(String[] args) throws SchedulerException, ParseException {

		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();

		scheduler.start();
	}
}
