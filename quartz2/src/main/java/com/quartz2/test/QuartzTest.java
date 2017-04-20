package com.quartz2.test;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author Administrator
 *
 *
 * 没有属性文件
 *
 *
 */
public class QuartzTest {  
    /** 
     * Test Job : main method  
     */  
    public static void main(String[] args) {  
        QuartzTest test = new QuartzTest();  
        try{  
            test.startSchedule();  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    }  
      
    public void startSchedule()throws Exception{  
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();  
        JobDetail jobDetail = new JobDetail("testJob", Scheduler.DEFAULT_GROUP, TestJob.class);  
        jobDetail.getJobDataMap().put("name","testJob");    
        //结束时间         
        long end = System.currentTimeMillis() + 9000L;    
        //执行10次，每3秒执行一次，到9秒后结束    
        SimpleTrigger trigger = new SimpleTrigger("test",null,new Date(),new Date(end),10,3000L);    
        scheduler.scheduleJob(jobDetail, trigger);    
        scheduler.start();    
    }     
}  
