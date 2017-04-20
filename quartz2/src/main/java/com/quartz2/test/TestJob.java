package com.quartz2.test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Administrator
 *
 * 
 * http://wei-peng-84.iteye.com/blog/454604
 *
 */
public class TestJob implements Job{  
    
    public TestJob(){}  
    /** 
     * Test Job == Print Job Name + Execute Time 
     * @param context 
     * @throws JobExecutionException 
     */  
    public void execute(JobExecutionContext context)throws JobExecutionException{  
        String name = context.getJobDetail().getJobDataMap().getString("name");    
        System.out.println("job executing..."+ name + "********Date : " + new Date());   
    }  
}  
