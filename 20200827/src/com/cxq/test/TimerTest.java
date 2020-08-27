package com.cxq.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author CXQ
 * @version 1.0
 */
public class TimerTest {
    private static class AlarmClockTask extends TimerTask {

        private boolean ring;

        @Override
        public void run() {
            Date now = new Date();
            String pattern = "HH:mm:ss";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String dateStr = simpleDateFormat.format(now);
            String str = "17:06:00";
            if (str.equals(dateStr)) {
                ring = true;
            }
            if(ring){
                System.out.println("Got up.....");
            }
        }

        void setRing(boolean ring) {
            this.ring = ring;
        }
    }

    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();
        AlarmClockTask alarmClockTask = new AlarmClockTask();
        timer.schedule(alarmClockTask, 0, 1000);
        char exitFlag = 'q';
        if (System.in.read() == exitFlag) {
            timer.cancel();
            alarmClockTask.setRing(false);
        }
    }
}
