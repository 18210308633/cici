package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Created by rensong.pu on 2016/11/3.
 */
public class TestStream {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("a_m",23,"男"),new Person("b_f",22,"女"),
                                             new Person("c_m",24,"男"),new Person("d_f",25,"女"),
                                             new Person("e_m",25,"男"),new Person("f_f",32,"女"));

        // 平均年龄
        OptionalDouble avg = persons.stream()
                .mapToInt(Person::getAge)
                .average();// JDK contains many terminal operations (such as average, sum, min, max, and count) that return one value by combining the contents of a stream.
        System.out.println("average age->"+avg.getAsDouble());

        //不小于25岁的女性
        List<String> names = persons.stream()
                .filter(person -> person.getAge()>=25&&person.getGender().equals("女"))
                .map(Person::getName)
                .collect(Collectors.toList());
        names.forEach(n->{
                          System.out.println(n);
                      });

        //年龄求和
        //sum的表达方式,the identity element is 0; this is the initial value of the sum of ages and the default value if no members exist in the collection roster.
        Integer sum =  persons.stream()
                .map(Person::getAge)
                .reduce(0,(a,b)->a+b);
        // -- 等同于 ---------
       Integer sum2 = persons.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("sum->"+sum+" sum2->"+sum2);

    }

}
class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}