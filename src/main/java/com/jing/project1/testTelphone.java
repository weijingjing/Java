package com.jing.project1;

/**
 * Created by weijj on 2017/9/5.
 * testTelphone 类 必须由无参的构造方法
 * 包含main函数，来执行主代码
 */
public class testTelphone {
    public testTelphone(){

    }


    public static void main(String[] args) {
        //定义一个新的Telphone对象，并赋初值
        Telphone phone2 = new Telphone(4.5f,4.5f,1.5f);
        //对象调用sendMessage()方法
        //phone2.sendMessage();
        phone2.setScreen(4.2f);
        System.out.println("screen:"+phone2.getScreen()+"cpu:"+phone2.getCpu()+"memory:"+phone2.getMemory());
    }
}