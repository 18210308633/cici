package com.pattern.factory;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class MinusCalc extends Calc {
    public MinusCalc(int[] num) {
        super(num);
    }

    @Override
    public double calc() {
        int result = 0;
        for(int i=0;i<num.length;i++){
            result-=num[i];
        }
        return result;
    }
}
