package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 运输油站点选址
 * 1升油/公里 ， 穿行1000公里， capacity = 500升
 * Created by rensong.pu on 2016/9/9.
 */
public class OilTransfer {
    /**
     * 策略是由中点s+t = 500 逆推 ， 求得使用 x 最少的取值情况
     *
     * @param s store 站点油量
     * @param t take d带取油量
     * @param x 站点距离起点的距离
     * @return
     */
    private List<Integer> indexs = new ArrayList<Integer>();//收集站点选址数据

    public int countN(int s, int t, int x) {
        int t_pre = t + s - x; //上个站点的store
        int s_pre = x + t - t_pre;
        if (t_pre < x) {
            //这种情况下，意味着到达站点后的油不足以回到起点，暂不考虑用沿途站点的油(有待证明)
            indexs.add(Integer.valueOf(x));
            x /= 2; //将选址以二分减小
        }
        if (s_pre == 0) {
            return;
        }
        //已经建立起第一个站点，第二个站点 从 s_pre , t_pre , x(减半后) 开始
        countN(s_pre, t_pre, x);
    }

    public static void main(String[] args) {

    }
}
