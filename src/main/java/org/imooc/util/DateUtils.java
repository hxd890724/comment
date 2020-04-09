package org.imooc.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类.
 */
public class DateUtils {

    /**
     * 时间格式
     */
    public static final String FORMAT_ONE = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_TWO = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_THREE = "yyyyMMdd-HHmmss";
    public static final String FORMAT_FOUR = "yyyyMMddHHmmss";
    public static final String FORMAT_SSS = "yyyy-MM-dd HH:mm:ss:SSS";
    public static final String LONG_DATE_FORMAT = "yyyy-MM-dd";
    public static final String SHORT_DATE_FORMAT = "MM-dd";
    public static final String LONG_TIME_FORMAT = "HH:mm:ss";
    public static final String MONTG_DATE_FORMAT = "yyyy-MM";

    private DateUtils() {

    }


    /**
     * 把符合日期格式的字符串转换为日期类型.
     *
     * @param dateStr
     * @param format
     * @return
     */
    public static Date string2Date(String dateStr, String format) {
        Date d = null;
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            formater.setLenient(false);
            d = formater.parse(dateStr);
        } catch (Exception e) {
            d = null;
            // TODO 封装错误
        }
        return d;
    }

    /**
     * 把日期转换为字符串.
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateToString(Date date, String format) {
        String result = "";
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            result = formater.format(date);
        } catch (Exception e) {
            // TODO 封装错误
        }
        return result;
    }

    /**
     * 获取当前时间的指定格式.
     *
     * @param format
     * @return
     */
    public static String getCurrDate(String format) {
        return dateToString(new Date(), format);
    }

    /**
     * 获得昨天的指定格式.
     *
     * @param format
     * @return
     */
    public static String getYesterDay(String format) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, -1);
        return new SimpleDateFormat(format).format(c.getTime());
    }

}
