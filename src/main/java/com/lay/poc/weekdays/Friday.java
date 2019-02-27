package com.lay.poc.weekdays;

public class Friday {

    public static boolean isFriday(String strCheck) {
        strCheck = strCheck.trim();
        strCheck = strCheck.toLowerCase();
        switch(strCheck) {
            case "friday":
            case "fri":
                return true;
        }
        //return strCheck.equals("friday");
        return false;
    }
}
