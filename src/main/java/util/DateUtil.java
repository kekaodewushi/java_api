package util;

/**
 * Created by zangyaoyi on 2017/7/24.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
    private static Calendar calObject;
    public static final String DATE_FORMAT_FULL = "yyyy/MM/dd HH:mm:ss";
    public static final String DATE_FORMAT_SHORT = "yyyy/MM/dd";
    public static final String DATE_FORMAT_SHORT01 = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YEAR = "yyyy";
    public static final String DEFAULT_FORMAT = "yyyyMMdd";
    public static final String DATE_FORMAT_CN = "yyyy年MM月dd日HH时mm分ss秒";
    public static final String DATE_FORMAT_CN_SHORT = "yyyy年MM月dd日";

    public DateUtil() {
    }

    public static Date getAddYear(Date dteDate, long lngNumber) {
        Date dteRet = null;

        try {
            calObject = Calendar.getInstance();
            calObject.setTime(dteDate);
            calObject.add(1, (int) lngNumber);
            dteRet = calObject.getTime();
        } catch (Exception var5) {
            dteRet = null;
        }

        return dteRet;
    }

    public static Date getAddMonth(Date dteDate, long lngNumber) {
        Date dteRet = null;

        try {
            calObject = Calendar.getInstance();
            calObject.setTime(dteDate);
            calObject.add(2, (int) lngNumber);
            dteRet = calObject.getTime();
        } catch (Exception var5) {
            dteRet = null;
        }

        return dteRet;
    }

    public static Date getAddDay(Date dteDate, long lngNumber) {
        Date dteRet = null;

        try {
            calObject = Calendar.getInstance();
            calObject.setTime(dteDate);
            calObject.add(5, (int) lngNumber);
            dteRet = calObject.getTime();
        } catch (Exception var5) {
            dteRet = null;
        }

        return dteRet;
    }

    public static Date getAddMinute(Date dteDate, long lngNumber) {
        Date dteRet = null;

        try {
            calObject = Calendar.getInstance();
            calObject.setTime(dteDate);
            calObject.add(12, (int) lngNumber);
            dteRet = calObject.getTime();
        } catch (Exception var5) {
            dteRet = null;
        }

        return dteRet;
    }

    public static Date getAddSecond(Date dteDate, long lngNumber) {
        Date dteRet = null;

        try {
            calObject = Calendar.getInstance();
            calObject.setTime(dteDate);
            calObject.add(13, (int) lngNumber);
            dteRet = calObject.getTime();
        } catch (Exception var5) {
            dteRet = null;
        }

        return dteRet;
    }

    public static int compareDate(Date dteDate1, Date dteDate2) {
        boolean comparRet = false;
        if (dteDate1 != null && dteDate2 != null) {
            int comparRet1 = dteDate1.compareTo(dteDate2);
            return comparRet1;
        } else {
            return -1;
        }
    }

    public static int compareDateDistance(Date dteDate1, Date dteDate2) {
        boolean comparRet = false;
        if (dteDate1 != null && dteDate2 != null) {
            int comparRet1 = dteDate1.compareTo(dteDate2);
            return comparRet1;
        } else {
            return 0;
        }
    }

    public static Date parse(String dateString, String dateFormat) {
        if (dateString != null && !"".equals(dateString.trim())) {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            Date date = null;

            try {
                date = sdf.parse(dateString);
            } catch (Exception var5) {
                logger.error("parse exception,e.getMessage():{}", var5.getMessage());
            }

            return date;
        } else {
            return null;
        }
    }

    public static Date parse(String dateString) {
        return parse(dateString, "yyyyMMdd");
    }

    public static String toString(Date date, String dateFormat) {
        if (!"".equals(date) && date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            String str = sdf.format(date);
            return str;
        } else {
            return "bug: date is null";
        }
    }

    public static String toString(Date date) {
        return toString(date, "yyyyMMdd");
    }

    public static long toLong(Date date) {
        if (date == null) {
            return 0L;
        } else {
            long d = date.getTime();
            return d;
        }
    }

    public static Date toDate(long time) {
        if ("".equals(Long.valueOf(time))) {
            return new Date();
        } else {
            Date date = new Date(time);
            return date;
        }
    }

    public static String currentStringDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String now = dateFormat.format(date);
        return now;
    }

    public static String StringYourDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = dateFormat.format(date);
        return now;
    }

    public static String longDateToString(long now) {
        if (now == 0L) {
            return "";
        } else {
            Date date = toDate(now);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return dateFormat.format(date);
        }
    }

    public static String currentYourDate(String formate) {
        Date date = new Date();
        return toString(date, formate);
    }

    public static Date currentDate() {
        Date date = new Date();
        return date;
    }

    public static Date add(int field, Date date, int value) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(field, value);
        Date newDate = ca.getTime();
        return newDate;
    }

    public static int get(int field, Date date) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        int value = ca.get(field);
        return value;
    }

    public static Date getLastMonth(String month) {
        Calendar ca = Calendar.getInstance();
        int m = 0;

        try {
            m = Integer.parseInt(month);
        } catch (NumberFormatException var4) {
            logger.error("getLastMonth exception,e.getMessage():{}", var4.getMessage());
        }

        ca.add(2, -m);
        return ca.getTime();
    }

    public static String getSeconds() {
        Calendar ca = Calendar.getInstance();
        return String.valueOf(ca.getTimeInMillis());
    }

    public static String toDateFormat(Date dteDate, String strDateFormat) {
        String strRet = null;

        try {
            strRet = (new SimpleDateFormat(strDateFormat)).format(dteDate);
        } catch (Exception var4) {
            strRet = "";
        }

        return strRet;
    }

    public static long getCurrentSeconds() {
        Date dt = new Date();
        return dt.getTime() / 1000L;
    }

    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        boolean isSameYear = cal1.get(1) == cal2.get(1);
        boolean isSameMonth = isSameYear && cal1.get(2) == cal2.get(2);
        boolean isSameDate = isSameMonth && cal1.get(5) == cal2.get(5);
        return isSameDate;
    }

    public static long getExpireSecondsOfCurDay() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(1), calendar1.get(2), calendar1.get(5), 0, 0, 0);
        return getCurrentSeconds() - calendar1.getTimeInMillis() / 1000L;
    }

    public static long getRemainSecondsOfCurDay() {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(1), calendar1.get(2), calendar1.get(5), 23, 59, 59);
        return calendar1.getTimeInMillis() / 1000L - getCurrentSeconds();
    }

    public static BigDecimal intToBigDecimal3(int i) {
        BigDecimal value = (new BigDecimal(i)).multiply(Global.Dec3);
        value = value.setScale(3, 4);
        return value;
    }
    public static void main(String[] args) throws ParseException {
       String a=intToBigDecimal3(1).toString();
        System.out.println(a);
    }
}
