package com.pattern;

import com.pattern.observer.AbstractSubject;
import com.pattern.observer.MySubject;
import com.pattern.observer.Observer1;

/**
 * 设计模式
 * 创建型：工厂方法、抽象工厂、单例、建造者、原型
 * 结构型模式：适配器、装饰器、代理、外观、桥接、组合、享元
 * 行为型：策略、模板方法、观察者、迭代子模式、责任链、命令、备忘录、状态、访问者、中介、解释器
 * 并发型模式
 * 线程池模式
 * Created by rensong.pu on 2016/12/28.
 */
public class DesignPattern {
    public static void main(String[] args) {
    /*    int[] nums = new int[]{1,2,3,4};
        Calc calc = CalcFactory1.getCalc(OPT.ADD, nums);
        Calc calc2 = CalcFactory1.getCalc(OPT.MUTIPLE, nums);
        System.out.println(calc.calc());
        System.out.println(calc2.calc());
        MinusFactory mins = new MinusFactory();
        Calc calc3 = mins.getCalc(nums);
        System.out.println(calc3.calc());

      */
        /*ProtoType p1 = new ProtoType();
        try {
            ProtoType p2 = (ProtoType)p1.deepClone();
            ProtoType p3 = (ProtoType) p1.clone();
            System.out.println("p1和p2引用是否一致->"+(p1==p2)+"\t 对象是否相等"+p1.equals(p2));
            System.out.println("p1和p3引用是否一致->"+(p1==p3)+"\t 对象是否相等"+p1.equals(p3));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

/*        Adapter2 adapter2 = new Adapter2(new Source());//传入适配类
        adapter2.method1();*/

      /*  new Decorator(new Base()).work();*/

       /* BufferedReader bufferedReader = null;
        Path path = Paths.get("E://whiteboarddata.txt");
        try {
            bufferedReader = Files.newBufferedReader(path, Charset.forName("utf-8"));
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
*/

       /* ProxySource so = new ProxySource();
        so.method();*/

        AbstractSubject subject = new MySubject();
        subject.add(new Observer1());
        subject.operation();

    }
}
