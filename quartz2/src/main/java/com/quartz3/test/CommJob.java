package com.quartz3.test;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @author Administrator
 *
 * http://www.cnblogs.com/yinyi521/p/6054140.html
 *
 */
@Component
@SuppressWarnings("rawtypes")
public class CommJob {

    public void sjcq() {
        
        System.out.println("Hello World!!!");    
    }
}
