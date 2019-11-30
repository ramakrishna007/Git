package com.xyz;

import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

public class App {
    private static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World! Today is " + getToday().toString());
        log.info("Hello World! Today is " + getToday().toString());
    }

    public static Date getToday() {
//                String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
        Date today = Calendar.getInstance().getTime()
        return today;
    }
}
