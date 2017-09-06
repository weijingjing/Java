package com.jing.project1;


/**
 * Created by weijj on 2017/9/5.
 * Telphone 类 --定义对象，设置set get方法
 * 设置构造方法：有参和无参 -- 默认如果都有执行有参的构造方法
 */
public class Telphone {
    private float screen;
    private float cpu;
    private float memory;

    void sendMessage(){
        System.out.println("手机拥有发短信的功能");
    }

    /*设置对象的set/get方法*/
    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
        //调用了sendMessage() 方法
        this.sendMessage();
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public Telphone(){
        System.out.println("执行了无参的构造方法");
    }
    public Telphone(float newScreen,float newCpu,float newMemory){
        if(newScreen < 3.5f){
            System.out.println("您输入的Screen参数不正确，自动赋值3.5f");
            this.screen = 3.5f;
        }else {
            System.out.println("您输入的Screen参数正确");
        }
        //this.screen = newScreen;
        this.cpu = newCpu;
        this.memory = newMemory;
        System.out.println("执行了有参的构造方法");
    }
}
