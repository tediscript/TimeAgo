package com.tediscript.time;

/**
 *
 * @author tediscript
 */
public class TimeAgo {

    public static long SECOND = 1000l;
    public static long MINUTE = SECOND * 60l;
    public static long HOUR = MINUTE * 60l;
    public static long DAY = HOUR * 24l;
    public static long MONTH = DAY * 30l;
    public static long YEAR = DAY * 365l;

    public static String fromPhpTime(long phptime) {
        long current = System.currentTimeMillis();
        long gap = current - (phptime * 1000l);

        if (gap / YEAR == 1l) {
            return String.valueOf(gap / YEAR) + " year";
        } else if (gap / YEAR > 1l) {
            return String.valueOf(gap / YEAR) + " years";
        }

        if (gap / MONTH == 1l) {
            return String.valueOf(gap / MONTH) + " month";
        } else if (gap / MONTH > 1l) {
            return String.valueOf(gap / MONTH) + " months";
        }

        if (gap / DAY == 1l) {
            return "yesterday";
        } else if (gap / DAY > 1l) {
            return String.valueOf(gap / DAY) + " days";
        }

        if (gap / HOUR == 1l) {
            return String.valueOf(gap / HOUR) + " hour";
        } else if (gap / HOUR > 1l) {
            return String.valueOf(gap / HOUR) + " hours";
        }

        if (gap / YEAR == 1l) {
            return String.valueOf(gap / YEAR) + " year";
        } else if (gap / YEAR > 1l) {
            return String.valueOf(gap / YEAR) + " years";
        }

        if (gap / MINUTE == 1l) {
            return String.valueOf(gap / MINUTE) + " minute";
        } else if (gap / MINUTE > 1l) {
            return String.valueOf(gap / MINUTE) + " minutes";
        }

        if (gap / SECOND == 1l) {
            return String.valueOf(gap / SECOND) + " second";
        } else if (gap / SECOND > 1l) {
            return String.valueOf(gap / SECOND) + " seconds";
        }

        return "";
    }
}
