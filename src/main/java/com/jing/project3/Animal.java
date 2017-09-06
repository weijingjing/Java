package com.jing.project3;

/**
 * Created by weijj on 2017/9/6.
 */
public class Animal extends Object{
    //父类要先定义这个方法，然后子类再去重写这个方法，test类中才能调用
   public void eat() {
       System.out.println("动物具有吃东西的能力");
   }
    public void watchDoor() {
    }

}
