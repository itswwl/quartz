package com.quartz2.test;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * @author Administrator
 *
 *
 * https://my.oschina.net/u/1042053/blog/135958
 * 
 * quartz 2.2  不需要配置xml和属性文件
 *
 */
public class HelloJob implements Job {
	public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        String a = (String)jobDataMap.get("Test1");
        System.out.println("Hello " + a);
    }
}

