package com.pattern.build;

import com.pattern.factory.AddCalc;

import java.util.ArrayList;
import java.util.List;

/**
 * 相比于工厂模式创建单个类的模式，建造者模式将各种产品集中管理，用来创建复合对象。
 * 复合对象指的是->某个类具有不同的属性
 * Created by rensong.pu on 2016/12/28.
 */
public class Builder {
    private List<AddCalc> addCalcList = new ArrayList<>();

    //产生若干个加法计算器
    public void genAddCalc(int count,int[] num){
        if(count<=0) return;
        for(int i=0;i<count;i++){
            addCalcList.add(new AddCalc(num));
        }
    }
}
