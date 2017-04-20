package com.quartz1.test;

import java.text.ParseException;
import java.util.Calendar;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.HolidayCalendar;


public class HelloQuartzSchedulingHolidayCalendar {

    public static void main(String[] args) 
        throws SchedulerException, ParseException {

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        JobDetail jobDetail = new JobDetail("helloQuartzJob", 
                Scheduler.DEFAULT_GROUP, HelloQuartzJob.class);

        Calendar cal = Calendar.getInstance();
        cal.set(2012, Calendar.OCTOBER, 1); // 国庆节

        HolidayCalendar holidayCal = new HolidayCalendar();
        holidayCal.addExcludedDate(cal.getTime()); // 排除该日期

        // addCalendar(String calName, Calendar calendar, 
        //             boolean replace, boolean updateTriggers)
        scheduler.addCalendar("calendar", holidayCal, true, false);

        String cronExpression = "30/5 * * * * ?"; // 每5s触发任务        
        CronTrigger cronTrigger = new CronTrigger("cronTrigger", 
                Scheduler.DEFAULT_GROUP, cronExpression);

        cronTrigger.setCalendarName("calendar");

        scheduler.scheduleJob(jobDetail, cronTrigger);

        scheduler.start();
    }

}
