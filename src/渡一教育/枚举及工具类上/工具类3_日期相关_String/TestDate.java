package src.渡一教育.枚举及工具类上.工具类3_日期相关_String;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestDate {

    public static void main(String[] args) {
        //返回当前系统时间与计算机元年的毫秒差
        //计算机元年：1970-1-1    00:00:00
        long time = System.currentTimeMillis();
        System.out.println(time);//精确到毫秒值

        Date date1 = new Date(1575617104921L);//之前的时间
        Date date2 = new Date();//默认用当前的系统时间构建的date对象
        System.out.println(date2);//重写toString方法    格林威治格式

        boolean x = date1.before(date2);//比较date1是否在date2之前
        boolean y = date1.after(date2);//比较date1是否在date2之后
        date1.setTime(1575618033638L);//用来设置date1的时间
        long result = date1.getTime();//获取date1的时间值   毫秒值
        System.out.println(x);
        System.out.println(y);

        //按照顺序比较
        // 若为-1表示调用的时间在前参数的时间在后
        // 若为1表示调用的时间在后参数的时间在前
        System.out.println(date1.compareTo(date2));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String v = sdf.format(date1);//通过sdf对象将date1格式化成你描述的样子
        System.out.println(v);

        Calendar calendar = Calendar.getInstance();//构建一个系统当前时间得calendar对象
        calendar.setTime(date1);//获取时间

        //calendar.set(Calendar.YEAR,2015);//可以更改时间

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);//月份是从0开始-->11结束

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //java.util.GregorianCalendar[time=1575618033638,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=6,DAY_OF_YEAR=340,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=40,SECOND=33,MILLISECOND=638,ZONE_OFFSET=28800000,DST_OFFSET=0]
        System.out.println(calendar);

        TimeZone tz = calendar.getTimeZone();
        System.out.println(tz.getID());//获取定位
        System.out.println(tz.getDisplayName());//中国标准时间
    }
}
