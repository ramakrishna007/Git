package com.xyz;

import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World! Today is " + getToday().toString());
    }

    public static Date getToday() {
//                String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
        Date today = Calendar.getInstance().getTime();
        return today;
    }
}
