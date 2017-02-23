package demogame.com.circulartimeseekbar;


import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by paras pahwa on 23/2/17.
 */

public abstract class CalculateValues {

    public static String starttime(int value)
    {
        String startTime = "00:00";
        String newtime="";
        String hours,min;
        int minutes = value*2;
        int h = minutes / 60 + Integer.parseInt(startTime.substring(0,1));
        int m = minutes % 60 + Integer.parseInt(startTime.substring(3,4));
        if(String.valueOf(h).length()==1)
        {
           hours  = String.valueOf("0"+ String.valueOf(h));
            Log.e("before ","int "+hours);

        }
        else
        {
            hours  = String.valueOf(h);
        }

        if(String.valueOf(m).length()==1)
        {
            min  = String.valueOf("0"+ String.valueOf(m));
            Log.e("before ","int "+hours);

        }
        else
        {
            min  = String.valueOf(m);
        }

        newtime = hours+":"+min;


        return newtime;
    }

    public static String dateTimeDiff(String start_date, String end_date) {
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = df.parse(start_date);
            dateTwo = df.parse(end_date);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        long timeDiff = dateOne.getTime() - dateTwo.getTime();

        long seconds = timeDiff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        String time = hours % 24 + ":" + minutes % 60;
        return time;


    }
}
