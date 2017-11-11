/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Do Hung Cuong
 */
public class DateTimeService {

    public static Date getDateTime(String created_at) {
        SimpleDateFormat myFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'ICT' yyyy");
        try {
            return myFormat.parse(created_at);
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Date formatDateTime(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String formatMillisecond(int millis) {
        long second = (millis / 1000) % 60;
        long minute = (millis / (1000 * 60)) % 60;
        long hour = (millis / (1000 * 60 * 60)) % 24;
        long sss = millis - hour * 3600 * 1000 - minute * 60 * 1000 - second * 1000;

        return String.format("%02d:%02d:%02d:%03d", hour, minute, second, sss);
    }
}
