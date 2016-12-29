package com.pattern.factory;

/**
 * Created by rensong.pu on 2016/12/28.
 */
public class AddCalc extends Calc{

    public AddCalc(int[] num) {
        super(num);
    }

    @Override
    public double calc() {
        int sum = 0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
}
