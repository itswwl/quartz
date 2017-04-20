package com.quartz1.test;

import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/*
 * 基于 Quartz 开发企业级任务调度应用
 * https://www.ibm.com/developerworks/cn/opensource/os-cn-quartz/
 * 
 * 
 * cron表达式详解
 * http://www.cnblogs.com/junrong624/p/4239517.html
 * 
 * 
 * */

/**
 * @author Administrator
 *
 *
 * http://blog.csdn.net/huihuimimi17/article/details/8215779
 * 
 * quartz  1.8
 *
 */
public class HelloQuartzJob implements Job {

    public void execute(JobExecutionContext context) 
            throws JobExecutionException {
        System.out.println("Hello, Quartz! - executing its JOB at "+ 
            new Date() + " by " + context.getTrigger().getName());
    }
}
