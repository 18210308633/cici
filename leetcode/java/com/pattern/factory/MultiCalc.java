package com.pattern.factory;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class MultiCalc extends Calc{
    public MultiCalc(int[] num) {
        super(num);
    }

    @Override
    public double calc() {
        int rs = 1;
        for(int i=0;i<num.length;i++){
            rs*=num[i];
        }
        return rs;
    }
}
