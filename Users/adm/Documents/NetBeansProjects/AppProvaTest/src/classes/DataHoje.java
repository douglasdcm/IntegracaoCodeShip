/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.Calendar;

/**
 *
 * @author TestRock!
 */
public class DataHoje {
    public String hoje(int offsetDay, int offsetMouth, int offsetYear){
            Calendar cal = Calendar.getInstance();
            Integer dayOfMonth = cal.get(Calendar.DAY_OF_MONTH) + offsetDay;
            Integer month = cal.get(Calendar.MONTH) + 1 + offsetMouth;
            Integer year = cal.get(Calendar.YEAR) + offsetYear;

            String dayOfMonth_s = dayOfMonth.toString();
            String month_s = month.toString();
            String year_s = year.toString();
            
            if (dayOfMonth < 10){
                dayOfMonth_s = "0"+dayOfMonth_s;
            }
            if (month < 10){
                month_s = "0"+month_s;
            }            
            String data = dayOfMonth_s+"/"+month_s+"/"+year_s;
            return data;
    }
}
