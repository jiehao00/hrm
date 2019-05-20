package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* @Description:    获取时间工具类
* @Author:         jieHao
* @CreateDate:     2019/5/20 21:07
* @UpdateUser:     jieHao
* @UpdateDate:     2019/5/20 21:07
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class GetYearAndMonthUtil {

    Calendar cale = Calendar.getInstance();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
    Date currentTime = new Date();

    /**
    * 方法实现说明  获取当前年份
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/20 21:08
    */
    public String getYear(){

        String year = String.valueOf(cale.get(Calendar.YEAR));
        return year;
    }

    /**
    * 方法实现说明 获取当前月份
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/20 21:12
    */
    public String getMonth(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM");
        String month=formatter.format(currentTime);
        return month;
    }
    /**
    * 方法实现说明  获取当前年月
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/20 21:14
    */
    public String getMonthYear(){
        String timeStr = formatter.format(currentTime);
        return timeStr;
    }

    public String getPreMonthYear(){
        cale.add(Calendar.MONTH, 1);
        String preMonth = formatter.format(cale.getTime());
        return preMonth;
    }


}
