package com.leetcode;

/**
 * Created by thinkpad on 2016/8/8.
 */
public class UnTaged {
    /**
     * 197. Rising Temperature
     * Sql题
     */
    public void sql() {
        //   TO_DAYS(date) return the number of days between from year 0 to date
        String sql = "select wt1.ID FROM weather wt1,weather wt2 WHERE \n" +
                "wt1.Temperature > wt2.Temperature \n" +
                "AND TO_DAYS(wt1.DATE)-TO_DAYS(wt2.DATE)=1";
        // SUBDATE(date,interval) return date which is (date-interval)
        String sql2 = "select wt1.DATE,SUBDATE(wt1.DATE,1),TO_DAYS(wt1.DATE),wt1.ID FROM weather wt1,weather wt2 WHERE \n" +
                "wt1.Temperature > wt2.Temperature \n" +
                "AND TO_DAYS(wt1.DATE)-TO_DAYS(wt2.DATE)=1";
    }
}
