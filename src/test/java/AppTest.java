package com.xyz;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class AppTest {

        @Test
        public void testGetToday() {
                String actual = App.getToday();
                String expected = new SimpleDateFormat("dd-MMM-yyyy")
                                .format(new Date());
                assertEquals(expected, actual);
        }
}