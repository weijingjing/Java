package com.jing.project2;

/**
 * Created by weijj on 2017/9/6.
 */
public class Initail {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        //dog.method();
        /*dog子类定义的值*/
        System.out.println("age:"+dog.age+"         "+"name:"+dog.name);
    }
}
