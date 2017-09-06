package com.jing.project4;

/**
 * Created by weijj on 2017/9/6.
 */
public class SmartPhone extends TelPhone implements IplayGame{
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }
    @Override
    public void message() {
        System.out.println("通过语音发短信");
    }
    @Override
    public void play() {
        System.out.println("通过语音玩游戏");
    }
}
