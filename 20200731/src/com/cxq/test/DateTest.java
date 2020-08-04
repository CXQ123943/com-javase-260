package com.cxq.test;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author CXQ
 * @version 1.0
 */
public class DateTest {

    @Test
    public void dateBuild(){
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void format() {
        Date now = new Date();
        String pattern = "YYYY年MM月dd日 hh:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        String result = dateFormat.format(now);
        System.out.println(result);
    }


    @Test
    public void parse() {
        String olympicDate = "2008-08-08";
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date result = null;
        try {
            result = dateFormat.parse(olympicDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
