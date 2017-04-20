package com.quartz1.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 * 
 *  http://www.cnblogs.com/nick-huang/p/4848843.html
 *  
 *  
 *  有属性文件
 *  
 *  注意1.6 ， 1.7 ， 1.8属性文件，xml文件的差别
 *  http://blog.csdn.net/java_zone/article/details/51163507
 *   
 */
public class HelloJob implements Job {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        // 此任务仅打印日志便于调试、观察
    	System.out.println(this.getClass().getName() + " trigger...");
        this.logger.debug(this.getClass().getName() + " trigger...");
    }

}
