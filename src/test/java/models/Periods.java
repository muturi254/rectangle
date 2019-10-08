package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periods {
    public static void main(String[] args) {
        // new Date object
       String earlierDateString = "07/7/2017";
       SimpleDateFormat nextdf = new SimpleDateFormat("MM/dd/YYYY");

       Date earlierDate = new Date();

       try {
           earlierDate = nextdf.parse(earlierDateString);
       } catch (ParseException e) {
            e.printStackTrace();
       }

        Date currentDate = new Date();
        boolean isTodayAfterEarlierDate = earlierDate.after(currentDate);
        System.out.println(isTodayAfterEarlierDate);
        System.out.print("hhhh");
    }
}
