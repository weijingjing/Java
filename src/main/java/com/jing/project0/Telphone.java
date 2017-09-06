package com.jing.project0;

/**
 * Created by weijj on 2017/9/4.
 */
public class Telphone {
    /*声明变量的时候可以赋初值，如未复制默认为0*/
    float screen = 1.0f;
    float cpu = 1.1f;
    float memory = 1.2f;
    /*全局变量*/
    int var = 20;

    /*定义无返回值的方法*/
    void sendMessage(){
        System.out.println("手机具有发短信的功能");
    }
    void call(){
        /*局部变量*/
        byte Localvar = 10;
        System.out.println("var:"+this.var);
        System.out.println("Localvar:"+Localvar);
        System.out.println("screen:"+this.screen+"cpu:"+this.cpu+"memory"+this.memory+"手机具有打电话的功能");
    }

    /*无参构造方法*/
    public Telphone (){
        System.out.println("Telphone无参的构造方法");
    }
    /*含参构造方法*/
    public Telphone(float newScreen,float newCpu,float newMemory){
        this.screen = newScreen;
        this.cpu = newCpu;
        this.memory = newMemory;
        System.out.println("Telphone有参的构造方法");
    }
}
