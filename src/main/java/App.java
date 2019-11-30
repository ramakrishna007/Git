package com.xyz;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class App {
    private static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World! Today is " + getToday().toString());
        log.info("Hello World! Today is " + getToday());
        throw new IOException();
    }

    public static Date getToday() {
//                String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
        Date today = Calendar.getInstance().getTime();
        return today;
    }
}
