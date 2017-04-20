package com.quartz3.test;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.quartz.Job;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
/**
 * @author Administrator
 * 
 * 
 * http://liuzidong.iteye.com/blog/1118992
 * 
 * 
 * quartz 2.2   不需要配置xml和属性文件
 * 
 */
public class HelloJob implements Job {  
  
    private static Logger _log = LoggerFactory.getLogger(HelloJob.class);  
     
    public HelloJob() {  
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
         System.out.println("================================"); 
        _log.error(" 咫尺天涯: " + new Date());  
          
    }  
}  

